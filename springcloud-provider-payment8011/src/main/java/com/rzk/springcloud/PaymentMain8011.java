package com.rzk.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@MapperScan("com.rzk.springcloud.dao")
@SpringBootApplication
public class PaymentMain8011 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8011.class,args);
    }
}
