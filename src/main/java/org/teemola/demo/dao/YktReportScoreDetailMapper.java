package org.teemola.demo.dao;

import org.teemola.demo.entity.YktReportScoreDetail;

public interface YktReportScoreDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktReportScoreDetail record);

    int insertSelective(YktReportScoreDetail record);

    YktReportScoreDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktReportScoreDetail record);

    int updateByPrimaryKey(YktReportScoreDetail record);
}