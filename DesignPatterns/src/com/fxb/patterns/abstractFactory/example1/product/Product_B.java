package com.fxb.patterns.abstractFactory.example1.product;

public class Product_B extends BaseProduct {

    private String name;
    private Component component_A;
    private Component component_B;

    public Product_B() {
    }

    public Product_B(String name) {
        this.name = name;
        System.out.println("准备开始生产产品  "+this.name);
    }

    @Override
    public void use() {
        System.out.println("使用产品------"+this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component getComponent_A() {
        return component_A;
    }

    public void setComponent_A(Component component_A) {
        this.component_A = component_A;
    }

    public Component getComponent_B() {
        return component_B;
    }

    public void setComponent_B(Component component_B) {
        this.component_B = component_B;
    }
}
