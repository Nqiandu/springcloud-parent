package com.xxx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JN
 * @Date 2020/4/27 16:11
 * @Version 1.0
 **/
@RefreshScope
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/config")
    public String config() {
        return port;
    }
}
