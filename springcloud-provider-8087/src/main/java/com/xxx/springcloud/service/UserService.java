package com.xxx.springcloud.service;

import com.xxx.springcloud.mapper.UserMapper;
import com.xxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/27 17:14
 * @Version 1.0
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    /**查询所有的用户信息
     * @return
     */
    public List<User> selectAllUsers() {
        return userMapper.selectAll();
    }
}
