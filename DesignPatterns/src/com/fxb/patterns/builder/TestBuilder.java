package com.fxb.patterns.builder;

import com.fxb.patterns.builder.example.*;

public class TestBuilder {
    public static void main(String[] args) {

        Director director = new Director(new CommonBuilder());

        CarCommon common = (CarCommon)director.constructCar();
        System.out.println("***********获取普通汽车***********");
        System.out.println(common.getBody().getName());
        System.out.println(common.getWheel().getName());
        System.out.println(common.getEngine().getName());
        System.out.println(common.getSecuritySystem().getName());
        System.out.println(common.getComponentsA().getName());
        System.out.println("***********获取普通汽车***********");

        director = new Director(new SpecialBuilder());
        CarSpecial special = (CarSpecial)director.constructCar();
        System.out.println("***********获取炫酷跑车***********");
        System.out.println(special.getBody().getName());
        System.out.println(special.getWheel().getName());
        System.out.println(special.getEngine().getName());
        System.out.println(special.getSecuritySystem().getName());
        System.out.println(special.getComponentsB().getName());
        System.out.println("***********获取炫酷跑车***********");

    }
}
