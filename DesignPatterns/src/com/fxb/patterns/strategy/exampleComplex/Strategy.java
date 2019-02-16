package com.fxb.patterns.strategy.exampleComplex;

public interface Strategy {
    /** 根据上一次结果 获取下一个手势 */
    Hand nextHand();
    /** 为下一个手势提供参考依据 */
    void study(boolean win);

}
