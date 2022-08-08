package com.rzk.springcloud.service;

import com.rzk.springcloud.pojo.Payment;
import com.rzk.springcloud.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

@Service
@FeignClient("SPRINGCLOUD-PAYMENT-SERVICE")
public interface PaymentOpenFeignService{

    @GetMapping(value = "/rzk/springcloud/payment/getId/{id}")
    public CommonResult getPaymentById(@PathVariable("id") int id);

    @GetMapping(value = "/rzk/springcloud/payment/payment/feign/timeout")
    public String paymentFeignTimeout() ;
}
