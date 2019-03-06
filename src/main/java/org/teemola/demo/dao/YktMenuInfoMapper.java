package org.teemola.demo.dao;

import org.teemola.demo.entity.YktMenuInfo;

public interface YktMenuInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktMenuInfo record);

    int insertSelective(YktMenuInfo record);

    YktMenuInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktMenuInfo record);

    int updateByPrimaryKey(YktMenuInfo record);
}