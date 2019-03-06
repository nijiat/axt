package org.teemola.demo.dao;

import org.teemola.demo.entity.YktTeachingCalendarInfo;

public interface YktTeachingCalendarInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktTeachingCalendarInfo record);

    int insertSelective(YktTeachingCalendarInfo record);

    YktTeachingCalendarInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktTeachingCalendarInfo record);

    int updateByPrimaryKey(YktTeachingCalendarInfo record);
}