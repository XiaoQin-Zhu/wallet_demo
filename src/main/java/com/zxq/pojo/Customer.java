package com.zxq.pojo;

import java.util.List;

/**
 * 账户
 */
public class Customer {
    private Integer id;//主键id
    private int status;//账户状态
    private Double amount;//账户余额
    private String pwd;//支付密码
    private User user;//所属用户
    private List<Bankcard> bankcards;//一个账户可以绑定多张银行卡

    public List<Bankcard> getBankcards() {
        return bankcards;
    }

    public void setBankcards(List<Bankcard> bankcards) {
        this.bankcards = bankcards;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
