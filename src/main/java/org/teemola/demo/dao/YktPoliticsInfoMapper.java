package org.teemola.demo.dao;

import org.teemola.demo.entity.YktPoliticsInfo;

public interface YktPoliticsInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktPoliticsInfo record);

    int insertSelective(YktPoliticsInfo record);

    YktPoliticsInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktPoliticsInfo record);

    int updateByPrimaryKey(YktPoliticsInfo record);
}