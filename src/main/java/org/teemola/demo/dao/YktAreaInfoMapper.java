package org.teemola.demo.dao;

import org.teemola.demo.entity.YktAreaInfo;

public interface YktAreaInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktAreaInfo record);

    int insertSelective(YktAreaInfo record);

    YktAreaInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktAreaInfo record);

    int updateByPrimaryKey(YktAreaInfo record);
}