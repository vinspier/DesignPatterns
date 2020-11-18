package com.fxb.patterns.builder.example;

/**
 * 具体建造类
 * 除了继承其父类和接口外的方法
 * 可以定义其他与此类特殊的方法
 * */
public class SpecialBuilder extends AbstractBuilder {
    private CarSpecial car = new CarSpecial("建造高性能跑车");

    @Override
    public Builder createBody() {
        CarBody body = new CarBody("高性能跑车车身");
        this.car.setBody(body);
        return this;
    }

    @Override
    public Builder createWheel() {
        CarWheel wheel = new CarWheel("高性能跑车轮胎");
        this.car.setWheel(wheel);
        return this;
    }

    @Override
    public Builder createEngine() {
        CarEngine engine = new CarEngine("高性能跑车发动机");
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public Builder createSecuritySystem() {
        CarSecuritySystem securitySystem = new CarSecuritySystem("高性能跑车安全系统");
        this.car.setSecuritySystem(securitySystem);
        return this;
    }

    /** 此类特殊的方法 在具体子类中实现 只属于此类 */
    public void combineSpecialComponentsB(){
        ComponentsB componentsB = new ComponentsB("高性能跑车尾翼");
        this.car.setComponentsB(componentsB);
    }

    @Override
    public AbstractCar getCar() {
        combineSpecialComponentsB();
        return this.car;
    }
}
