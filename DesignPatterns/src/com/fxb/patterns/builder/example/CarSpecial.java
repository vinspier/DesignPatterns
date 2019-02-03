package com.fxb.patterns.builder.example;

/**
 * 具体产品类
 * 除了持有父类属性外，还可定义此类特有的属性
 * */
public class CarSpecial extends AbstractCar {
    private ComponentsB componentsB;

    public CarSpecial() {
    }

    public CarSpecial(String name) {
        super(name);
    }

    public ComponentsB getComponentsB() {
        return componentsB;
    }

    public void setComponentsB(ComponentsB componentsB) {
        this.componentsB = componentsB;
    }
}
