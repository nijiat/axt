package org.teemola.demo.dao;

import org.teemola.demo.entity.YktStudentPerformance;

public interface YktStudentPerformanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktStudentPerformance record);

    int insertSelective(YktStudentPerformance record);

    YktStudentPerformance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktStudentPerformance record);

    int updateByPrimaryKey(YktStudentPerformance record);
}