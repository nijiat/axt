package org.teemola.demo.dao;

import org.teemola.demo.entity.YktPedagogicalMethodInfo;

public interface YktPedagogicalMethodInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktPedagogicalMethodInfo record);

    int insertSelective(YktPedagogicalMethodInfo record);

    YktPedagogicalMethodInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktPedagogicalMethodInfo record);

    int updateByPrimaryKey(YktPedagogicalMethodInfo record);
}