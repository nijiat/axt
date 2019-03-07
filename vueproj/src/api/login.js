import request from '@/utils/request'

export function login(username, password) {
    return request({
        url: '/api/login/auth',
        method: 'post',
        data: {   // located in body --post
            username,
            password
        }
    })
}

// 获取用户角色与其他用户信息
export function getInfo(token) {
    return request({
        url: '/api/login/info',
        method: 'get',
        params: { token }   // located in url --get
    })
}

export function logout() {
    return request({
        url: '/api/login/logout',
        method: 'post'
    })
}