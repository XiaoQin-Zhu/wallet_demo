package com.zxq.pojo;

import java.util.List;

/**
 * 银行卡
 */
public class Bankcard {
    private Integer id;//主键id
    private String no;//银行卡号
    private int type;//银行卡类型
    private String tel;//银行卡绑定的手机号
    private String holderName;//持卡人姓名
    private String holderNo;//持卡人身份证
    private List<Customer> customers;//一张银行卡可以给多个用户绑定

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderNo() {
        return holderNo;
    }

    public void setHolderNo(String holderNo) {
        this.holderNo = holderNo;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
