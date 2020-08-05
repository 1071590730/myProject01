package com.wjb.dao;

import com.wjb.pojo.User1;

public interface User1Mapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User1 record);

    int insertSelective(User1 record);

    User1 selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User1 record);

    int updateByPrimaryKey(User1 record);
}