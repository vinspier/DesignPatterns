package com.fxb.patterns.builder.example;


/**
 * 具体建造类
 * 除了继承其父类和接口外的方法
 * 可以定义其他与此类特殊的方法
 * */
public class CommonBuilder extends AbstractBuilder {
    private CarCommon car = new CarCommon("建造普通汽车");

    @Override
    public CarBody createBody() {
        CarBody body = new CarBody("普通汽车车身");
        this.car.setBody(body);
        return body;
    }

    @Override
    public CarWheel createWheel() {
        CarWheel wheel = new CarWheel("普通车汽车轮胎");
        this.car.setWheel(wheel);
        return wheel;
    }

    @Override
    public CarEngine createEngine() {
        CarEngine engine = new CarEngine("普通汽车发动机");
        this.car.setEngine(engine);
        return engine;
    }

    @Override
    public CarSecuritySystem createSecuritySystem() {
        CarSecuritySystem securitySystem = new CarSecuritySystem("普通汽车安全系统");
        this.car.setSecuritySystem(securitySystem);
        return securitySystem;
    }

    /** 此类特殊的方法 在具体子类中实现 只属于此类 */
    public void combineSpecialComponentsA(){
        ComponentsA componentsA = new ComponentsA("普通汽车天窗");
        this.car.setComponentsA(componentsA);
    }

    public AbstractCar getCar() {
        combineSpecialComponentsA();
        return this.car;
    }
}
