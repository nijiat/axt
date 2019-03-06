package org.teemola.demo.dao;

import org.teemola.demo.entity.YktExamTypeInfo;

public interface YktExamTypeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktExamTypeInfo record);

    int insertSelective(YktExamTypeInfo record);

    YktExamTypeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktExamTypeInfo record);

    int updateByPrimaryKey(YktExamTypeInfo record);
}