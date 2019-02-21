package com.fxb.patterns.FlyWeight;

import com.fxb.patterns.FlyWeight.example.Component;
import com.fxb.patterns.FlyWeight.example.ComponentFactory;

public class TestFlyWeight {
    public static void main(String[] args) {
        ComponentFactory factory = ComponentFactory.build();
        Component c1 = factory.create("组件1");
        Component c2 = factory.create("组件2");

        Component c11 = factory.create("组件1");
        Component c22 = factory.create("组件2");

        System.out.println(c1 == c11);
        System.out.println(c2 == c22);
    }
}
