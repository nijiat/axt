package org.teemola.demo.dao;

import org.teemola.demo.entity.YktStudentSelCourseInfo;

public interface YktStudentSelCourseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktStudentSelCourseInfo record);

    int insertSelective(YktStudentSelCourseInfo record);

    YktStudentSelCourseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktStudentSelCourseInfo record);

    int updateByPrimaryKey(YktStudentSelCourseInfo record);
}