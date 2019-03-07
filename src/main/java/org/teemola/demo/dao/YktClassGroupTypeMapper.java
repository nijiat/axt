package org.teemola.demo.dao;

import org.teemola.demo.entity.YktClassGroupType;

public interface YktClassGroupTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktClassGroupType record);

    int insertSelective(YktClassGroupType record);

    YktClassGroupType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktClassGroupType record);

    int updateByPrimaryKey(YktClassGroupType record);
}