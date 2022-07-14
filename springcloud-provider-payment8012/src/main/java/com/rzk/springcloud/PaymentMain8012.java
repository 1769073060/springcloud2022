package com.rzk.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("com.rzk.springcloud.dao")
@SpringBootApplication
public class PaymentMain8012 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8012.class,args);
    }
}
