package com.fxb.patterns.observer.example1;

/**
 * 图形观察者
 *
 * */
public class GraphicsObserver implements Observer{

    @Override
    public void update(Generator generator) {
        int no = generator.getNo();
        String result = "**************\n" + "*  no:" + no +"  *\n" + "**************";
        System.out.println("被观察的对象产生的对象为： ");
        System.out.println(result);
    }

}
