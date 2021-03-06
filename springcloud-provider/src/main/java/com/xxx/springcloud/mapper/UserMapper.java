package com.xxx.springcloud.mapper;

import com.xxx.springcloud.model.User;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/27 17:03
 * @Version 1.0
 **/
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
