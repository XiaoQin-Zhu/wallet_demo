package com.zxq.dao;

import com.zxq.pojo.Bill;

import java.util.List;
import java.util.Map;

public interface CustomerDao {
    public Double queryAmount(int id);
    public void deductionAmount(Map map);
    public void addAmount(Map map);
    public List<Bill> queryBill(int id);

}
