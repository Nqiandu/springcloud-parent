package com.xxx.springcloud.controller;

import com.xxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/27 16:36
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/allUser")
    public List<User> selectAllUsers() {
        return restTemplate.getForObject("http://localhost:8089/userAll", List.class);
    }
}
