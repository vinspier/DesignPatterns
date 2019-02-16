package com.fxb.patterns.strategy.exampleComplex;

/**
 * 手的形式类 “剪刀 石头 布”
 * */
public class Hand {

    public static final int HAND_VALUE_GUU = 0;//石头
    public static final int HAND_VALUE_CHO = 0;//剪刀
    public static final int HAND_VALUE_PAA = 0;//布

    private int value;

    public static final Hand[] hands = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA)
    };

    private static final String[] names = {"石头","剪刀","布"};

    private Hand(int value) {
        this.value = value % 3;
    }

    public static Hand getHand(int value){
        return hands[value];
    }

    public boolean isStronger(Hand hand){
        return fight(hand) == 1;
    }

    public boolean isWeaker(Hand hand){
        return fight(hand) == -1;
    }

    public boolean isEqual(Hand hand){
        return fight(hand) == 0;
    }

    private int fight(Hand hand){
        if (this == hand)
            return 0;
        else if ((this.value + 1) % 3 == hand.value)
            return 1;
        else
            return -1;

    }

    @Override
    public String toString() {
        return names[value];
    }
}
