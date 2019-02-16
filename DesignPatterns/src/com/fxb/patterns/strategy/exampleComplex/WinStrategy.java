package com.fxb.patterns.strategy.exampleComplex;

import java.util.Random;

/**
 * 策略实现类 1
 * */
public class WinStrategy implements Strategy{

    private Random random;
    private boolean won = false;
    private Hand preHand;

    public WinStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!won){
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
