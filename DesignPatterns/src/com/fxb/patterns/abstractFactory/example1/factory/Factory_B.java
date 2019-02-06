package com.fxb.patterns.abstractFactory.example1.factory;

import com.fxb.patterns.abstractFactory.example1.product.Component;
import com.fxb.patterns.abstractFactory.example1.product.Component_A2;
import com.fxb.patterns.abstractFactory.example1.product.Component_B2;
import com.fxb.patterns.abstractFactory.example1.product.Product_B;

public class Factory_B implements BaseFactory {
    @Override
    public Product_B createProduct(String name) {
        Product_B B = new Product_B(name);
        Component a2 = createComponent_a2();
        Component b2 = createComponent_b2();
        B.setComponent_A(a2);
        B.setComponent_B(b2);
        System.out.println("生产产品  "+B.getName()+"  完成");
        return B;
    }

    public Component createComponent_a2(){
        return new Component_A2();
    }
    public Component createComponent_b2(){
        return new Component_B2();
    }
}
