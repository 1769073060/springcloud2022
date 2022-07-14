package com.rzk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderMain8012 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain8012.class,args);
    }
}
