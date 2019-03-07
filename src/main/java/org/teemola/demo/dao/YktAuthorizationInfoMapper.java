package org.teemola.demo.dao;

import org.teemola.demo.entity.YktAuthorizationInfo;

public interface YktAuthorizationInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktAuthorizationInfo record);

    int insertSelective(YktAuthorizationInfo record);

    YktAuthorizationInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktAuthorizationInfo record);

    int updateByPrimaryKey(YktAuthorizationInfo record);
}