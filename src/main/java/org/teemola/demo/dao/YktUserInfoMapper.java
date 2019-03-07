package org.teemola.demo.dao;

import org.teemola.demo.entity.YktUserInfo;

public interface YktUserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktUserInfo record);

    int insertSelective(YktUserInfo record);

    YktUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktUserInfo record);

    int updateByPrimaryKey(YktUserInfo record);
}