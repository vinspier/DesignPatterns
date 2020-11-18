package com.fxb.patterns.builder.example;

/**
 * 抽象建造类 继承建造接口
 * 除了接口方法外 可以定义部分实现的方法
 * */
public abstract class AbstractBuilder implements Builder{

    @Override
    public abstract AbstractCar getCar();
}
