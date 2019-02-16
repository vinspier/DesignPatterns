package com.fxb.patterns.strategy.example;

/**
 * 战略实现类2 实现具体的一种战略方式
 * */
public class Strategy2 implements Strategies {
    @Override
    public void useStrategy() {
        System.out.println("使用策略2");
    }
}
