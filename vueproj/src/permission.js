import router from '@/router'
import store from '@/store'
import { getToken } from '@/utils/auth'

const whiteList = ['/login']// no redirect whitelist

router.beforeEach((to, from, next) => {
    if (getToken()) { // determine if there has token
        /* has token*/
        console.log("has token")
        console.log(from.path)
        console.log(to.path)

        if (to.path === '/login') {
            next({ path: '/' })
        } else {
            if (store.getters.roles.length === 0) { // 判断当前用户是否已拉取完 user_info信息
                store.dispatch('GetInfo').then(res => { // 拉取user_info
                    console.log(res)
                    const roles = res.roleName // note: roles must be a array! such as: ['editor','develop']
                    store.dispatch('GenerateRoutes', { roles }).then(() => { // 根据roles权限生成可访问的路由表
                        console.log("add route:")
                        console.log(store.getters.addRouters)
                        router.addRoutes(store.getters.addRouters) // 动态添加可访问路由表
                        next({ ...to, replace: true }) // hack方法 确保addRoutes已完成 ,set the replace: true so the navigation will not leave a history record
                    })
                }).catch((err) => {
                    store.dispatch('FedLogOut').then(() => {
                        console.log(err)
                        next({ path: '/' })
                    })
                })
            } else {
                next() //当有用户权限的时候，说明所有可访问路由已生成 如访问没权限的全面会自动进入404页面
            }
        }
    } else {
        /* has no token*/
        if (whiteList.indexOf(to.path) !== -1) { // 在免登录白名单，直接进入
            next()
        } else {
            next(`/login?redirect=${to.path}`) // 否则全部重定向到登录页
        }
    }
})