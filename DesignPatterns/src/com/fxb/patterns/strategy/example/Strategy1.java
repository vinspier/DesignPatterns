package com.fxb.patterns.strategy.example;

/**
 * 战略实现类1 实现具体的一种战略方式
 * 一般在实际开发中 可以为某一种算法
 * */
public class Strategy1 implements Strategies {
    @Override
    public void useStrategy() {
        System.out.println("使用策略1");
    }
}
