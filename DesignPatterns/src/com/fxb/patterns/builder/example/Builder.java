package com.fxb.patterns.builder.example;

/**
 * 建造接口 定义具体建造子类通用的方法
 * 这些方法也是面向调用者
 * */
public interface Builder {

    Builder createBody();
    Builder createWheel();
    Builder createEngine();
    Builder createSecuritySystem();
    AbstractCar getCar();
}
