package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author JN
 * @Date 2020/4/27 16:53
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xxx.springcloud"})
public class ApplicationRun8092 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8092.class, args);
    }
}
