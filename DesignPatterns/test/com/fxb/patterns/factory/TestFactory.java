package com.fxb.patterns.factory;

import com.fxb.patterns.factory.example.*;

public class TestFactory {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        ProductA bpA = (ProductA) factoryA.create();
        System.out.println(bpA.getName());
        System.out.println(bpA.getCode());
        System.out.println(bpA.getCreateTime());
        System.out.println(bpA.getSpecialField());
        System.out.println("--------------------------------------------");
        Factory factoryB = new ConcreteFactoryB();
        ProductB bpB = (ProductB) factoryB.create();
        System.out.println(bpB.getName());
        System.out.println(bpB.getCode());
        System.out.println(bpB.getCreateTime());
        System.out.println(bpB.getSpecialField());
    }
}
