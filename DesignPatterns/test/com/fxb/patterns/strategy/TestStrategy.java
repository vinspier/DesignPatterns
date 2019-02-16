package com.fxb.patterns.strategy;

import com.fxb.patterns.strategy.example.Strategy1;
import com.fxb.patterns.strategy.example.Strategy2;
import com.fxb.patterns.strategy.example.StrategyUtil;

public class TestStrategy {
    public static void main(String[] args) {
        StrategyUtil strategyUtil = new StrategyUtil();
        strategyUtil.setStrategies(new Strategy1());
        strategyUtil.use_strategy();
        strategyUtil.setStrategies(new Strategy2());
        strategyUtil.use_strategy();
    }
}
