package com.rzk.springcloud.service;

import com.rzk.springcloud.pojo.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient("SPRINGCLOUD-PAYMENT-SERVICE")
public interface PaymentOpenFeignService{

    @GetMapping(value = "/rzk/springcloud/payment/getId/{id}")
    public Payment getPaymentById(@PathVariable("id") int id);


}
