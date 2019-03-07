import Vue from 'vue'
import Router from 'vue-router'

// in development-env not use lazy-loading, because lazy-loading too many pages will cause webpack hot update too slow.
// so only in production use lazy-loading;


Vue.use(Router)


/**
* hidden: true                   if `hidden:true` will not show in the sidebar(default is false)
* alwaysShow: true               if set true, will always show the root menu, whatever its child routes length
*                                if not set alwaysShow, only more than one route under the children
*                                it will becomes nested mode, otherwise not show the root menu
* redirect: noredirect           if `redirect:noredirect` will no redirect in the breadcrumb
* name:'router-name'             the name is used by <keep-alive> (must set!!!)
* meta : {
    title: 'title'               the name show in subMenu and breadcrumb (recommend set)
    icon: 'svg-name'             the icon show in the sidebar
    breadcrumb: false            if false, the item will hidden in breadcrumb(default is true)
  }
**/
export const constantRouterMap = [
    { path: '/login', component: () => import('@/views/login/index'), hidden: true },
    { path: '/404', component: () => import('@/views/404'), hidden: true },

    {
        path: '/',
        component: () => import('@/views/index/index'),
        name: 'indexpage',
        hidden: true
    },

]

export const asyncRouterMap = [
    {
        path: '/student',
        component: () => import('@/views/student/index'),
        meta: { roles: ['student'] }
    },
    {
        path: '/teacher',
        component: () => import('@/views/teacher/index'),
        meta: { roles: ['teacher'] }
    },
    { path: '*', redirect: '/404', hidden: true }

]

export default new Router({
    // mode: 'history', //后端支持可开
    // scrollBehavior: () => ({ y: 0 }),
    scrollBehavior(to, from, savedPos) {
        if (savedPos) {
            return savedPos
        } else {
            return {
                x: 0,
                y: 0
            }
        }
    },
    routes: constantRouterMap
})