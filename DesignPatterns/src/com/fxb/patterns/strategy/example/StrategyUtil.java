package com.fxb.patterns.strategy.example;

/**
 * 战略使用的帮助类 可以设置不同的战略采取不同的措施
 * */
public class StrategyUtil {
    private Strategies strategies;

    public StrategyUtil() {
    }

    public StrategyUtil(Strategies strategies) {
        this.strategies = strategies;
    }

    public void use_strategy(){
        strategies.useStrategy();
    }

    public void setStrategies(Strategies strategies) {
        this.strategies = strategies;
    }
}
