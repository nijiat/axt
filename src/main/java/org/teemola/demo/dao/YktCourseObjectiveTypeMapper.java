package org.teemola.demo.dao;

import org.teemola.demo.entity.YktCourseObjectiveType;

public interface YktCourseObjectiveTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktCourseObjectiveType record);

    int insertSelective(YktCourseObjectiveType record);

    YktCourseObjectiveType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktCourseObjectiveType record);

    int updateByPrimaryKey(YktCourseObjectiveType record);
}