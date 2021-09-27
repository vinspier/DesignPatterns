package com.fxb.patterns.factory;

import com.alibaba.fastjson.JSONObject;
import com.fxb.patterns.factory.example.*;

public class TestFactory {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        ProductA bpA = (ProductA) factoryA.create();
        System.out.println(JSONObject.toJSONString(bpA));

        System.out.println("--------------------------------------------");

        Factory factoryB = new ConcreteFactoryB();
        ProductB bpB = (ProductB) factoryB.create();
        System.out.println(JSONObject.toJSONString(bpB));
    }
}
