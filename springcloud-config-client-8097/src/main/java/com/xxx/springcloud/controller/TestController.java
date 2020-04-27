package com.xxx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JN
 * @Date 2020/4/27 15:56
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${mybatis.type-aliases-package}")
    private String mybatisTypePackage;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @RequestMapping("/config")
    public String config() {
        return port+"----"+mybatisTypePackage+"------"+driverClassName;
    }
}
