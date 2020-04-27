package com.xxx.springcloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author JN
 * @Date 2020/4/27 16:54
 * @Version 1.0
 **/
@SpringBootApplication
public class RestConfig {

    // 负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /*@Bean
    public IRule randomRule() {
        // 随机算法
        return new RandomRule();
    }*/

    /*@Bean
    public IRule bestAvailableRule() {
        // 选择一个最小的请求
        return new BestAvailableRule();
    }*/
}
