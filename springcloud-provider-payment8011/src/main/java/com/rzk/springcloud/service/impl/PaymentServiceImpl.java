package com.rzk.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rzk.springcloud.dao.PaymentDao;
import com.rzk.springcloud.pojo.Payment;
import com.rzk.springcloud.service.IPaymentService;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dell
 * @since 2022-07-02
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentDao, Payment> implements IPaymentService {

}
