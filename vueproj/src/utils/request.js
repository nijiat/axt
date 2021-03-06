import axios from 'axios'
import store from '@/store'
import { getToken } from 'utils/auth'

// 创建axios实例
const service = axios.create({
    baseURL: process.env.BASE_URL, // api 的 base_url
    timeout: 5000 // 请求超时时间
})

// request拦截器
service.interceptors.request.use(
    config => {
        if (store.getters.token) {
            config.headers['userToken'] = getToken() // 让每个请求携带自定义token 请根据实际情况自行修改
        }
        return config
    },
    error => {
        // Do something with request error
        console.log(error) // for debug
        Promise.reject(error)
    }
)

// response 拦截器
service.interceptors.response.use(
    response => {
        /**
         * code为非20000是抛错
         */
        const res = response.data
        if (res.code !== "100") {
            // 50008:非法的token; 50012:其他客户端登录了;  50014:Token 过期了;
            if (res.code === 50008 || res.code === 50012 || res.code === 50014) {
                console.log(res).then(() => {
                    store.dispatch('FedLogOut').then(() => {
                        location.reload() // 相当于浏览器返回键，为了重新实例化vue-router对象 避免bug
                    })
                })
            }
            return Promise.reject('error')
        } else {
            return response
        }
    },
    error => {
        console.log('err' + error) // for debug
        return Promise.reject(error)
    }
)

export default service