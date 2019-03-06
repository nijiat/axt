package org.teemola.demo.dao;

import org.teemola.demo.entity.YktUserGroupRelation;

public interface YktUserGroupRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktUserGroupRelation record);

    int insertSelective(YktUserGroupRelation record);

    YktUserGroupRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktUserGroupRelation record);

    int updateByPrimaryKey(YktUserGroupRelation record);
}