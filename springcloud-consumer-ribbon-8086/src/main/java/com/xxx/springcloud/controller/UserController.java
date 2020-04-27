package com.xxx.springcloud.controller;

import com.xxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/27 16:55
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;


    /**
     * riboon集成eureka的负载均衡
     * @return
     */
    @RequestMapping("/allUser")
    public List<User> selectAllUsers() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("springcloud-provider");
        System.out.println(serviceInstance.getPort());
        return restTemplate.getForObject("http://SPRINGCLOUD-PROVIDER/userAll", List.class);
    }


    /**
     * ribbon脱离eureka的负载均衡
     * @return
     */
    @RequestMapping("/allUserNoEureka")
    public List<User> selectUsers() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("springcloud-provider");
        System.out.println(serviceInstance.getPort());
        System.out.println(serviceInstance.getHost()+":"+serviceInstance.getPort()+"/userAll");
        return restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/userAll", List.class);
    }
}
