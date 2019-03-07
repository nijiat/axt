import router from '@/router'
import store from '@/store'
import { getToken } from '@/utils/auth'   // cookies

// element ui components
import NProgress from 'nprogress' // progress bar
import 'nprogress/nprogress.css' // progress bar style
import { Message } from 'element-ui'

NProgress.configure({ showSpinner: false })

const whiteList = ['/login']

router.beforeEach((to, from, next) => {
    NProgress.start()
    if (getToken()) { // 获取 持久层的token(cookies内)
        if (to.path === '/login') {
            next({ path: '/' }) // 已有token， 没必要再登录
            NProgress.done()
        } else {
            if (store.getters.name.length === 0) { // 判断当前用户是否已拉取完 user_info信息
                store.dispatch('GetInfo').then(res => { // 拉取user_info
                    const menuList = res.data.menuList // must be an Array!!!!
                    store.dispatch('GenerateRoutes', { menuList }).then(() => { // 根据roles权限生成可访问的路由表
                        router.addRoutes(store.getters.addRouters) // 动态添加可访问路由表
                        next({ ...to, replace: true }) // hack方法 确保addRoutes已完成 ,set the replace: true so the navigation will not leave a history record
                    })
                }).catch((err) => {
                    store.dispatch('FedLogOut').then(() => { // 获取信息失败，只能重新登录，清除store和cookies中的Token
                        Message.error(err || 'Verification failed, please login again')
                        next({ path: '/' })
                    })
                })
            } else {
                next() //已登录用户直接访问(如访问没权限的全面会自动进入404页面)
            }
        }
    } else {
        /* has no token*/
        if (whiteList.indexOf(to.path) !== -1) { // 在免登录白名单，直接进入
            next()
        } else {
            next(`/login?redirect=${to.path}`) // 重定向到登录页, 待验证！！！！
        }
    }
})

router.afterEach(() => {
    NProgress.done()
})