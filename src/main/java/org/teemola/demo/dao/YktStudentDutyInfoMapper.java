package org.teemola.demo.dao;

import org.teemola.demo.entity.YktStudentDutyInfo;

public interface YktStudentDutyInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktStudentDutyInfo record);

    int insertSelective(YktStudentDutyInfo record);

    YktStudentDutyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktStudentDutyInfo record);

    int updateByPrimaryKey(YktStudentDutyInfo record);
}