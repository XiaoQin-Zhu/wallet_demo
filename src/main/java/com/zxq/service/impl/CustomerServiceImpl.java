package com.zxq.service.impl;

import com.zxq.dao.CustomerDao;
import com.zxq.pojo.Bill;
import com.zxq.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 账户服务
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public Double queryAmount(int id) {
        return customerDao.queryAmount(id);
    }

    @Override
    public void consumption(Double price,int id) {
        Double amount1 = customerDao.queryAmount(id);
        if (amount1 > price){
            Double amount2 = amount1 - price;
            Map<String,Object> map = new HashMap<>();
            map.put("id",id);
            map.put("amount",amount2);
            customerDao.deductionAmount(map);
        }
    }

    @Override
    public void refund(Double price, int id) {
        Double amount1 = customerDao.queryAmount(id);
        Double amount2 = amount1 + price;
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("amount",amount2);
        customerDao.addAmount(map);
    }

    @Override
    public List<Bill> queryBill(int id) {
        return customerDao.queryBill(id);
    }
}
