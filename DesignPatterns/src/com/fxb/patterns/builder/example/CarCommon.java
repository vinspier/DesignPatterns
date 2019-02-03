package com.fxb.patterns.builder.example;

/**
 * 具体产品类
 * 除了持有父类属性外，还可定义此类特有的属性
 * */
public class CarCommon extends AbstractCar {
    private ComponentsA componentsA;

    public CarCommon() {
    }

    public CarCommon(String name) {
        super(name);
    }

    public ComponentsA getComponentsA() {
        return componentsA;
    }

    public void setComponentsA(ComponentsA componentsA) {
        this.componentsA = componentsA;
    }
}
