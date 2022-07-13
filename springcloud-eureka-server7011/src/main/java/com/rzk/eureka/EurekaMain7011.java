package com.rzk.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7011 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7011.class,args);
    }
}
