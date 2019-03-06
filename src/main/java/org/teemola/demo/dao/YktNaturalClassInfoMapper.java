package org.teemola.demo.dao;

import org.teemola.demo.entity.YktNaturalClassInfo;

public interface YktNaturalClassInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktNaturalClassInfo record);

    int insertSelective(YktNaturalClassInfo record);

    YktNaturalClassInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktNaturalClassInfo record);

    int updateByPrimaryKey(YktNaturalClassInfo record);
}