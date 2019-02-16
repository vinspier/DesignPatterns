package com.fxb.patterns.strategy;

import com.fxb.patterns.strategy.exampleComplex.Hand;
import com.fxb.patterns.strategy.exampleComplex.Player;
import com.fxb.patterns.strategy.exampleComplex.ProbStrategy;
import com.fxb.patterns.strategy.exampleComplex.WinStrategy;


public class TestStrategyComplex {
    public static void main(String[] args) {
        /*if (args.length != 2){
            System.out.println("Usage: java main randomseed1 randomseed2");
            System.out.println("Eample: java main 314 15");
            System.exit(0);
        }*/

        int seed1 = Integer.parseInt("314");
        int seed2 = Integer.parseInt("15");

        Player player1 = new Player("player1", new WinStrategy(seed1));
        Player player2 = new Player("player2",new ProbStrategy(seed2));

        for (int i = 0; i < 1000; i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStronger(nextHand2)){
                player1.win();
                player2.lose();
            }else if (nextHand1.isWeaker(nextHand2)){
                player1.lose();
                player2.win();
            }else {
                player1.equal();
                player2.equal();
            }
        }

        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
