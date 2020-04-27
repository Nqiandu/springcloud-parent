package com.xxx.springcloud.service;

import com.xxx.springcloud.model.User;
import feign.hystrix.FallbackFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/27 15:53
 * @Version 1.0
 **/
public class UserFallBackService implements FallbackFactory<IUserService> {
    public IUserService create(Throwable throwable) {
        return new IUserService() {
            public List<User> selectAllUsers() {
                List<User> userList = new ArrayList<User>();
                User user = new User();
                user.setId(10);
                user.setUsername("hahaha");
                user.setPassword("12345678");
                user.setSalt("9999");
                userList.add(user);
                return userList;
            }
        };
    }
}
