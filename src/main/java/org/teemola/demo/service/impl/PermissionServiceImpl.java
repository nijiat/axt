package org.teemola.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teemola.demo.dao.PermissionMapper;
import org.teemola.demo.entity.Permission;
import org.teemola.demo.service.PermissionService;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    /**
     * 查询某用户的 角色  菜单列表   权限列表
     */
    @Override
    public List<Permission> getUserPermission(String username) {
        // 暂定只返回对应用户的权限
        return permissionMapper.getUserPermission(username);
    }

}
