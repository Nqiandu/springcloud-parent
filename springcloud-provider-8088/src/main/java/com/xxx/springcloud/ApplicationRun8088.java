package com.xxx.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author JN
 * @Date 2020/4/27 17:18
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xxx.springcloud.mapper")
public class ApplicationRun8088 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8088.class, args);
    }
}
