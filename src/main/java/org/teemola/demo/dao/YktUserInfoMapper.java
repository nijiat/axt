package org.teemola.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.teemola.demo.entity.YktUserInfo;

public interface YktUserInfoMapper {
    YktUserInfo getUser(@Param("username")String username, @Param("password")String password);
    int deleteByPrimaryKey(Integer id);

    int insert(YktUserInfo record);

    int insertSelective(YktUserInfo record);

    YktUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktUserInfo record);

    int updateByPrimaryKey(YktUserInfo record);
}