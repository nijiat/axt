import Vue from 'vue'
import Vuex from 'vuex'
import getters from './getters'
import user from './modules/user'
import app from './modules/app'
import permission from './modules/permission'
Vue.use(Vuex)

export default new Vuex.Store({
    modules: {
        user,
        app,
        permission
    },
    getters
})