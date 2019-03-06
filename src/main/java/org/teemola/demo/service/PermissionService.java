package org.teemola.demo.service;

import com.alibaba.fastjson.JSONObject;
import org.teemola.demo.entity.BaseResponse;
import org.teemola.demo.entity.Permission;

import java.util.List;

public interface PermissionService {
    /**
     * 查询某用户的 角色  菜单列表   权限列表
     */
    List<Permission> getUserPermission(String username);
}
