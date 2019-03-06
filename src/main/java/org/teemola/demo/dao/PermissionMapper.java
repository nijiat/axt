package org.teemola.demo.dao;

import com.alibaba.fastjson.JSONObject;
import org.teemola.demo.entity.Permission;

import java.util.List;

public interface PermissionMapper {
    /**
     * 查询用户的角色 菜单 权限
     */
    List<Permission> getUserPermission(String username);

    /**
     * 查询所有的菜单
     */
//    Set<String> getAllMenu();

    /**
     * 查询所有的权限
     */
//    Set<String> getAllPermission();
}
