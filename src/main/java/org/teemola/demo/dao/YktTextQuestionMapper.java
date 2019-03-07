package org.teemola.demo.dao;

import org.teemola.demo.entity.YktTextQuestion;

public interface YktTextQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktTextQuestion record);

    int insertSelective(YktTextQuestion record);

    YktTextQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktTextQuestion record);

    int updateByPrimaryKey(YktTextQuestion record);
}