package org.teemola.demo.dao;

import org.teemola.demo.entity.YktPedagogicalType;

public interface YktPedagogicalTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktPedagogicalType record);

    int insertSelective(YktPedagogicalType record);

    YktPedagogicalType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktPedagogicalType record);

    int updateByPrimaryKey(YktPedagogicalType record);
}