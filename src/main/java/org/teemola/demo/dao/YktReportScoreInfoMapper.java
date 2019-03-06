package org.teemola.demo.dao;

import org.teemola.demo.entity.YktReportScoreInfo;

public interface YktReportScoreInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktReportScoreInfo record);

    int insertSelective(YktReportScoreInfo record);

    YktReportScoreInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktReportScoreInfo record);

    int updateByPrimaryKey(YktReportScoreInfo record);
}