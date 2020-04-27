package com.xxx.springcloud.controller;

import com.xxx.springcloud.model.User;
import com.xxx.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/27 17:17
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userAll")
    public List<User> selectAllUsers() {
        System.out.println("8088");
        return userService.selectAllUsers();
    }
}
