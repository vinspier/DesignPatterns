package com.fxb.patterns.factory.example;

import java.util.Date;

/**
 * 具体产品类A 继承抽象产品类
 * 并拥有自己的属性
 * */
public class ProductA extends BaseProduct {

    private  final String specialField = "具体产品A的特殊特性";
    private Date createTime;
    public ProductA() {
        setCreateTime(new Date());
    }

    public ProductA(String name) {
        super(name);
        setCreateTime(new Date());
    }

    public  String getSpecialField() {
        return specialField;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
