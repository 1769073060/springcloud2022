package com.rzk.springcloud.controller;

import com.rzk.springcloud.pojo.Payment;
import com.rzk.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    //public static final String PAYMENT_URL = "http://localhost:8011/rzk/springcloud/payment";
    public static final String PAYMENT_URL = "http://SPRINGCLOUD-PAYMENT-SERVICE";


    @Resource
    private RestTemplate restTemplate;

    @PostMapping(value = "create")
    public CommonResult create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/rzk/springcloud/payment/create",payment,CommonResult.class);
    }

    @GetMapping(value = "list")
    public CommonResult list(){
        return restTemplate.getForObject(PAYMENT_URL+"/rzk/springcloud/payment/list",CommonResult.class);
    }

    @GetMapping(value = "getById/{id}")
    public CommonResult getById(@PathVariable("id") String id){
        return restTemplate.getForObject(PAYMENT_URL+"/rzk/springcloud/payment/getId/"+id,CommonResult.class);
    }

}
