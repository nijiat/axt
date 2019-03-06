package org.teemola.demo.dao;

import org.teemola.demo.entity.YktClassRoomInfo;

public interface YktClassRoomInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktClassRoomInfo record);

    int insertSelective(YktClassRoomInfo record);

    YktClassRoomInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktClassRoomInfo record);

    int updateByPrimaryKey(YktClassRoomInfo record);
}