package com.fxb.patterns.factory.example;

/**
 * 抽象产品类
 * 定义同类型的产品的共性
 * */
public abstract class BaseProduct {

    private String name;
    private String code;

    public BaseProduct() {
    }

    public BaseProduct(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
