package com.fxb.patterns.abstractFactory.example1.factory;


import com.fxb.patterns.abstractFactory.example1.product.*;

public class Factory_A implements BaseFactory {
    @Override
    public BaseProduct createProduct(String name) {
        Product_A A = new Product_A(name);
        Component a1 = createComponent_A1();
        Component b1 = createComponent_B1();
        A.setComponent_A(a1);
        A.setComponent_B(b1);
        System.out.println("生产产品  "+A.getName()+"  完成");
        return A;
    }

    public Component createComponent_B1() {
        return new Component_B1();
    }

    public Component createComponent_A1(){
        return new Component_A1();
    }
}
