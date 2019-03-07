package org.teemola.demo.dao;

import org.teemola.demo.entity.YktMemberScoreInfo;

public interface YktMemberScoreInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktMemberScoreInfo record);

    int insertSelective(YktMemberScoreInfo record);

    YktMemberScoreInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktMemberScoreInfo record);

    int updateByPrimaryKey(YktMemberScoreInfo record);
}