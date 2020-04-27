package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author JN
 * @Date 2020/4/27 16:37
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun8091 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8091.class, args);
    }
}
