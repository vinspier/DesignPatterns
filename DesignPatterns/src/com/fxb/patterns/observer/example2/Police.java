package com.fxb.patterns.observer.example2;

/**
 * 具体的观察者
 * 实现 当被通知时因该做如何处理
 * */
public class Police implements Watcher {
    @Override
    public void update() {
        System.out.println("运输车已出发，警察出动保驾护航");
    }
}
