package com.fxb.patterns.observer.example1;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();

    @Override
    public void change() {
        for (int i = 0; i < 5; i++){
            no = random.nextInt(100);
            /** 数据发生改变时 通知观察者 */
            notifyObservers();
        }
    }
}
