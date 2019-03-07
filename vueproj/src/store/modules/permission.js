import { asyncRouterMap, constantRouterMap } from '@/router'

/**
 * 通过meta.role判断是否与当前用户权限匹配
 * @param menuList
 * @param route
 */
function hasPermission(menuList, route) {
    // 判断是否为角色数组，这里待修改--后端、前端
    if (!Array.isArray(menuList)) {
        menuList = [menuList]
    }
    if (route.name) {
        return menuList.some(menu => route.name == menu)
    } else {
        return true // 404页面默认为true
    }
}

/**
 * 递归过滤异步路由表，返回符合用户角色权限的路由表
 * @param routes asyncRouterMap
 * @param menuList
 */
function filterAsyncRouter(routes, menuList) {
    const res = []
    routes.forEach(route => {
        const tmp = { ...route }
        if (hasPermission(menuList, tmp)) {
            if (tmp.children) {
                tmp.children = filterAsyncRouter(tmp.children, menuList)
            }
            res.push(tmp)
        }
    })
    return res
}

const permission = {
    state: {
        routers: constantRouterMap,
        addRouters: []
    },
    mutations: {
        SET_ROUTERS: (state, routers) => {
            state.addRouters = routers
            state.routers = constantRouterMap.concat(routers)
        }
    },
    actions: {
        GenerateRoutes({ commit }, data) {
            return new Promise(resolve => {
                let accessedRouters = filterAsyncRouter(asyncRouterMap, data)
                commit('SET_ROUTERS', accessedRouters)
                resolve()
            })
        }
    }
}

export default permission