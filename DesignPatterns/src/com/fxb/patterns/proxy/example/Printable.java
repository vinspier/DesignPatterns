package com.fxb.patterns.proxy.example;


/**
 *
 * 主体类
 * 定义代理类和真实主体类接口API
 * 保持了代理类和真实主体类的一致性
 * */
public interface Printable {

    void setContent(String content);
    String getContent();
    void print();

}
