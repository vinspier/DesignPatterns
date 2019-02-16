package com.fxb.patterns.strategy.exampleComplex;

import java.util.Random;

/**
 * 策略实现类 2
 * */
public class ProbStrategy implements Strategy {

    private Random random;
    private int preValue = 0;
    private int currentValue = 0;
    private int[][] history = {
            {1,1,1},
            {1,1,1},
            {1,1,1}
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentValue));
        int handValue = 0;
        if (bet < history[currentValue][0])
            handValue = 0;
        else if (bet < history[currentValue][0] + history[currentValue][0])
            handValue = 1;
        else
            handValue = 2;
        preValue = currentValue;
        currentValue = handValue;
        return Hand.getHand(handValue);
    }

    private int getSum(int hv){
        int sum = 0;
        for (int i = 0; i < 3; i++){
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win)
            history[preValue][currentValue]++;
        else {
            history[preValue][(currentValue + 1) % 3]++;
            history[preValue][(currentValue + 2) % 3]++;
        }
    }
}
