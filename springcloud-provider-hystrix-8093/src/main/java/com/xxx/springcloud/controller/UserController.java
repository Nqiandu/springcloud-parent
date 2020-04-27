package com.xxx.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxx.springcloud.model.User;
import com.xxx.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/27 17:20
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userAll")
    @HystrixCommand(fallbackMethod = "dueToAllUsers")
    public List<User> selectAllUsers() throws Exception {
        System.out.println("8081");
        List<User> userList = userService.selectAllUsers();
        if (userList.size() > 0) {
            throw new Exception("测试异常");
        } else {

        }
        return userList;
    }

    public List<User> dueToAllUsers() {
        List<User> userList = new ArrayList<User>();
        User user = new User();
        user.setId(10);
        user.setUsername("hahaha");
        user.setPassword("12345678");
        user.setSalt("9999");
        userList.add(user);
        return userList;
    }
}
