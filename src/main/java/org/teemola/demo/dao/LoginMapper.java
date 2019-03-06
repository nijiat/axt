package org.teemola.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.teemola.demo.entity.User;

public interface LoginMapper {
    /**
     * 根据用户名和密码查询对应的用户
     */
    User getUser(@Param("username")String username, @Param("password") String password);
}
