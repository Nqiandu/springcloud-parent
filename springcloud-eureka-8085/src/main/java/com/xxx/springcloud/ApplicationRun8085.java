package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author JN
 * @Date 2020/4/27 17:01
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun8085 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8085.class, args);
    }
}
