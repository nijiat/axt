package org.teemola.demo.dao;

import org.teemola.demo.entity.YktGenderInfo;

public interface YktGenderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktGenderInfo record);

    int insertSelective(YktGenderInfo record);

    YktGenderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktGenderInfo record);

    int updateByPrimaryKey(YktGenderInfo record);
}