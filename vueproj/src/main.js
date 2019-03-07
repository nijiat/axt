import Vue from 'vue'
import App from './App.vue'
import store from './store'
import router from './router'

// permission control
import '@/permission'

// import element-ui
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import locale from 'element-ui/lib/locale/lang/zh-CN' // lang i18n 语言

// import scss, icon   -- 此处暂定
// import mock   -- 暂定

Vue.config.productionTip = false

Vue.use(ElementUI, { locale })

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app')

