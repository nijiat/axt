package org.teemola.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teemola.demo.dao.LoginMapper;
import org.teemola.demo.entity.BaseResponse;
import org.teemola.demo.entity.Permission;
import org.teemola.demo.entity.User;
import org.teemola.demo.service.LoginService;
import org.teemola.demo.service.PermissionService;
import org.teemola.demo.util.CommonUtil;
import org.teemola.demo.util.constants.Constants;
import org.teemola.demo.utils.error.MyError;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private PermissionService permissionService;


    /**
      * 登录表单提交
      */
    @Override
    public BaseResponse authLogin(Map<String,Object> map) {
        String username = (String)map.get("username");
        String password = (String)map.get("password");
        BaseResponse baseResponse = new BaseResponse();
        // shiro
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try{
            currentUser.login(token); // 身份认证交给shiro处理
            baseResponse.setData(token);
        }catch (AuthenticationException e){
            baseResponse = new MyError().InvalidPassword();
        }
        return baseResponse;
    }

    /**
     * 根据用户名和密码查询对应的用户
     */
    @Override
    public User getUser(String username, String password) {
        return loginMapper.getUser(username, password);
    }

    /**
     * 查询当前登录用户的权限等信息
     */
    @Override
    public BaseResponse getUserPermission() {
        // 从session中获取用户信息: username
        Session session = SecurityUtils.getSubject().getSession();
        User userinfo = (User)session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userinfo.getName();
        List<Permission>permissionList = permissionService.getUserPermission(username);
        session.setAttribute(Constants.SESSION_USER_PERMISSION, permissionList);
        return new BaseResponse(permissionList);
    }

    /**
     * 退出登录
     */
    @Override
    public BaseResponse logout() {
        try {
            Subject currentUser = SecurityUtils.getSubject();
            currentUser.logout();
        }catch (Exception e){
            e.printStackTrace();
        }
        return new BaseResponse();
    }
}






















