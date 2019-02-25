package com.fxb.patterns.observer.example1;

/**
 * 不做任何处理的观察者
 * */
public class NumberObserver implements Observer {

    @Override
    public void update(Generator generator) {
        System.out.println("被观察的对象产生的对象为 " + generator.getNo() );
    }

}
