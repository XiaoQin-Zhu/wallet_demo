package com.zxq.service;

import com.zxq.pojo.Bill;

import java.util.List;

public interface CustomerService {
    public Double queryAmount(int id);
    public void consumption(Double price,int id);
    public void refund(Double price,int id);
    public List<Bill> queryBill(int id);
}
