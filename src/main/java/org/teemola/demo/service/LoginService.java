package org.teemola.demo.service;


import com.alibaba.fastjson.JSONObject;
import org.teemola.demo.entity.BaseResponse;
import org.teemola.demo.entity.Permission;
import org.teemola.demo.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface LoginService {

    /**
     * 登录表单提交
     */
    BaseResponse authLogin(Map<String,String>map);

    /**
     * 根据用户名和密码查询对应的用户
     *
     * @param username 用户名
     * @param password 密码
     */
    User getUser(String username, String password);

    /**
     * 查询当前登录用户的权限等信息
     */
    BaseResponse getUserPermission();

    /**
     * 退出登录
     */
    BaseResponse logout();
}
