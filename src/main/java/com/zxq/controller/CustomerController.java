package com.zxq.controller;

import com.zxq.entity.Result;
import com.zxq.pojo.Bill;
import com.zxq.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 账户管理
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    //查余额
    @RequestMapping("/queryamount")
    public Result queryAmount(int id){
        try {
            Double amount = customerService.queryAmount(id);
            return new Result(true,"查询账户余额成功",amount);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"查询账户余额失败");
        }
    }

    //用户消费，本来应该在订单操作中进行业务数据库操作，这里假设是前端发送的请求，消费100元就在请求携带price参数为100
    @RequestMapping("/consumption")
    public Result consumption(Double price,int id){
        try {
            customerService.consumption(price,id);
            return new Result(true,"消费成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"消费失败");
        }
    }

    //用户退款，本来应该在订单操作中进行业务数据库操作，这里假设是前端发送的请求，退款20元就在请求携带price参数为20
    @RequestMapping("/refund")
    public Result refund(Double price,int id){
        try {
            customerService.refund(price,id);
            return new Result(true,"退款成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"退款失败");
        }
    }

    //查询账户账单信息，得到用户钱包金额变动明细
    @RequestMapping("/querybill")
    public Result queryBill(int id){
        try {
            List<Bill> bills = customerService.queryBill(id);
            return new Result(true,"查询账单成功",bills);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"查询账单失败");
        }
    }
}
