
const path = require('path')
// const configs = require('./config')

// resolve函数，用于下面设置路径alias
const resolve = dir => {
    return path.join(__dirname, dir)
}

module.exports = {
    outputDir: 'dist',
    lintOnSave: true,
    pages: undefined,

    chainWebpack: config => {
        // 设置 路径 alias
        config.resolve.alias
            .set('@', resolve('src'))
            .set('api', resolve('src/api'))
            .set('view', resolve('src/views'))
            .set('ast', resolve('src/assets'))
            .set('utils', resolve('src/utils'))
    },

    devServer: {
        proxy: {
            '/api': {
                target: 'http://127.0.0.1:8081/',
                pathRewrite: { '^/api': '' }, // 给代理命名后，在访问时把命名删除掉。即 api/xx = target/xx
                changeOrigin: true,     // target是域名的话，需要这个参数，
                secure: false,          // 设置支持https协议的代理
            }
        }
    }
}