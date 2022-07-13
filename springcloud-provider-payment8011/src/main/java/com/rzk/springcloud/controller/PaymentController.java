package com.rzk.springcloud.controller;


import com.rzk.springcloud.pojo.Payment;
import com.rzk.springcloud.service.IPaymentService;
import com.rzk.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dell
 * @since 2022-07-02
 */
@RestController
@RequestMapping("/rzk/springcloud/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private IPaymentService iPaymentService;


    @PostMapping(value = "create")
    public CommonResult create(@RequestBody Payment payment){
        boolean save = iPaymentService.save(payment);
        log.info("插入返回值{}"+save);
        if(save==true){
            return new CommonResult(200,"插入成功");
        }else {
            return new CommonResult(444,"插入失败");
        }
    }


    @GetMapping(value = "getId/{id}")
    public CommonResult getByIdPayment(@PathVariable("id") Long id){
        Payment byId = iPaymentService.getById(id);
        log.info("根据id查询对象{}"+byId);
        if (byId!=null){
            return new CommonResult(200,"查询成功",byId);
        }else{
            return new CommonResult(444,"查询失败",byId);
        }
    }

    @GetMapping(value = "list")
    public CommonResult getList(){
        List<Payment> list = iPaymentService.list();
        log.info("查询全部{}"+list);
        return new CommonResult(200,"查询成功",list);
    }
}
