package com.xxx.springcloud.service;

import com.xxx.springcloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/27 15:49
 * @Version 1.0
 **/
@FeignClient(value = "springcloud-provider", fallbackFactory = UserFallBackService.class)
public interface IUserService {

    @RequestMapping("/userAll")
    List<User> selectAllUsers();
}
