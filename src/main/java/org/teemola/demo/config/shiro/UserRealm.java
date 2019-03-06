package org.teemola.demo.config.shiro;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.teemola.demo.entity.User;
import org.teemola.demo.service.LoginService;
import org.teemola.demo.util.constants.Constants;

import java.util.Collection;


public class UserRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(UserRealm.class);

    @Autowired
    private LoginService loginService;

    /**
     * 用户角色与权限认证
     * 以下情况会调用
     * subject.hasRole(“admin”)
     * @RequiresRoles("admin")
     */
    @Override
    @SuppressWarnings("unchecked") /*抑制 对 未检查作业 的警告 */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // Session session = SecurityUtils.getSubject().getSession();
        // 查询用户权限
        // JSONObject permissionInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_PERMISSION);

        //为当前用户设置角色和权限
        JsonObject user = (JsonObject) getAvailablePrincipal(principals);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addStringPermissions((Collection<String>)user.get("permissionList")); // 对应PermissionMapper.xml中的值
        authorizationInfo.addRoles((Collection<String>)user.get("roleList"));
        // 记录相关日志
        logger.info("permission: " + user.get("roleList"));
        logger.info("该用户权限为：" + user.get("permissionList"));

        return authorizationInfo;
    }

    /**
     * 登录认证
     * 执行Subject.login() 时 会调用此方法
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();
        String password = new String((char[])token.getCredentials()); // ?????
        User user = loginService.getUser(username, password);
        System.out.println(user.getName());
        if(user == null){
            throw new UnknownAccountException(); /*Thrown when attempting to authenticate with a principal that doesn't exist in the system*/
        }

        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getName(),
                user.getPassword(),
//                ByteSource.Util.bytes("salt"),
                getName()
        );

        // 设置 session信息 (现不使用，改为cookie存放？？)
        user.setPassword("");
         SecurityUtils.getSubject().getSession().setAttribute(Constants.SESSION_USER_INFO, user);
        return authenticationInfo;
    }
}
