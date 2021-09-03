package com.fxb.patterns.observer.example2;

/**
 * 具体的观察者
 * 实现 当被通知时因该做如何处理
 * */
public class Security extends AbstractWatcher {

    @Override
    public void listen() {
        System.out.println("运输车已出动，安邦人员驾车保航");
    }

}
