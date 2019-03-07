package org.teemola.demo.dao;

import org.teemola.demo.entity.YktPermissionLevelInfo;

public interface YktPermissionLevelInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktPermissionLevelInfo record);

    int insertSelective(YktPermissionLevelInfo record);

    YktPermissionLevelInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktPermissionLevelInfo record);

    int updateByPrimaryKey(YktPermissionLevelInfo record);
}