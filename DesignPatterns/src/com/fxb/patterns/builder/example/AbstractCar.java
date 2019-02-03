package com.fxb.patterns.builder.example;

/**
 * 抽象产品类
 * 定义产品通用属性
 * */
public abstract class AbstractCar {
    private String name;
    private CarBody body;
    private CarEngine engine;
    private CarSecuritySystem securitySystem;
    private CarWheel wheel;

    public AbstractCar() {
    }

    public AbstractCar(String name) {
        this.name = name;
    }

    public CarBody getBody() {
        return body;
    }

    public void setBody(CarBody body) {
        this.body = body;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    public CarSecuritySystem getSecuritySystem() {
        return securitySystem;
    }

    public void setSecuritySystem(CarSecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    public CarWheel getWheel() {
        return wheel;
    }

    public void setWheel(CarWheel wheel) {
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
