package com.fxb.patterns.builder.example;

/**
 * 抽象建造类 继承建造接口
 * 除了接口方法外 可以定义部分实现的方法
 * */
public abstract class AbstractBuilder implements Builder{

    @Override
    public abstract CarBody createBody();

    @Override
    public abstract CarWheel createWheel();

    @Override
    public abstract CarEngine createEngine();

    @Override
    public abstract CarSecuritySystem createSecuritySystem();

    @Override
    public abstract AbstractCar getCar();
}
