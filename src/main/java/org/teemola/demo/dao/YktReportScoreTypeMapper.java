package org.teemola.demo.dao;

import org.teemola.demo.entity.YktReportScoreType;

public interface YktReportScoreTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktReportScoreType record);

    int insertSelective(YktReportScoreType record);

    YktReportScoreType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktReportScoreType record);

    int updateByPrimaryKey(YktReportScoreType record);
}