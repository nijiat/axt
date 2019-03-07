package org.teemola.demo.dao;

import org.teemola.demo.entity.YktStudentGroupReport;

public interface YktStudentGroupReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktStudentGroupReport record);

    int insertSelective(YktStudentGroupReport record);

    YktStudentGroupReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktStudentGroupReport record);

    int updateByPrimaryKey(YktStudentGroupReport record);
}