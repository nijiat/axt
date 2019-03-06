package org.teemola.demo.dao;

import org.teemola.demo.entity.YktGroupAuthorRelation;

public interface YktGroupAuthorRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktGroupAuthorRelation record);

    int insertSelective(YktGroupAuthorRelation record);

    YktGroupAuthorRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktGroupAuthorRelation record);

    int updateByPrimaryKey(YktGroupAuthorRelation record);
}