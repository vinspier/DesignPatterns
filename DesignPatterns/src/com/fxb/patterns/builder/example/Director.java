package com.fxb.patterns.builder.example;

/**
 * 建造导向类
 * 此类与具体的建造类无关 只调用建造接口所提供的方法
 * 达到可以根据不同的建造者创造出所对应的实例 实现可替换性
 * */
public class Director {
    private Builder builder;

    public Director() {
        this.builder = builder;
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 此处 director必须清楚知道builder接口定义的方法的具体意义
     *  类似于模板方法的抽象类定义的模板
     * */
    public AbstractCar constructCar(){
        builder.createBody();
        builder.createWheel();
        builder.createEngine();
        builder.createSecuritySystem();
        return builder.getCar();
    }
}
