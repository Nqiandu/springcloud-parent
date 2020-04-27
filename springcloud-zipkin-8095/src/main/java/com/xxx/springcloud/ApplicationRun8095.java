package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @Author JN
 * @Date 2020/4/27 17:25
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ApplicationRun8095 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8095.class, args);
    }
}
