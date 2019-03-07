package org.teemola.demo.dao;

import org.teemola.demo.entity.YktNoteInfo;

public interface YktNoteInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktNoteInfo record);

    int insertSelective(YktNoteInfo record);

    YktNoteInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktNoteInfo record);

    int updateByPrimaryKey(YktNoteInfo record);
}