package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author JN
 * @Date 2020/4/27 17:26
 * @Version 1.0
 **/
@SpringBootApplication
@EnableZuulProxy
public class ApplicationRun8094 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8094.class, args);
    }
}
