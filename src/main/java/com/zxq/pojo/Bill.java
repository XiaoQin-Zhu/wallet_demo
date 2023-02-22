package com.zxq.pojo;

import java.sql.Timestamp;

/**
 * 账单
 */
public class Bill {
    private Integer id;//主键id
    private String from;//账单来源
    private int type;//账单类型
    private Double amount;//账单金额
    private Timestamp addTime;//添加时间
    private int incomeExpense;//收入或支出
    private Customer customer;//所属账户

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIncomeExpense() {
        return incomeExpense;
    }

    public void setIncomeExpense(int incomeExpense) {
        this.incomeExpense = incomeExpense;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
