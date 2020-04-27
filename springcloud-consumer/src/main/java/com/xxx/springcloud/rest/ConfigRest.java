package com.xxx.springcloud.rest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author JN
 * @Date 2020/4/27 16:50
 * @Version 1.0
 **/
@SpringBootApplication
public class ConfigRest {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
