package com.rzk.springcloud.controller;

import com.rzk.springcloud.pojo.Payment;
import com.rzk.springcloud.service.PaymentOpenFeignService;
import com.rzk.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentOpenFeignController {

    @Resource
    private PaymentOpenFeignService paymentOpenFeignService;
    @GetMapping(value = "getById/{id}")
    public CommonResult getById(@PathVariable("id") int id){
        return new CommonResult(200,"", paymentOpenFeignService.getPaymentById(id));
    }

    @GetMapping(value = "timeout")
    public String timeout(){
        return paymentOpenFeignService.paymentFeignTimeout();
    }
}
