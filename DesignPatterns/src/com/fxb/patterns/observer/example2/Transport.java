package com.fxb.patterns.observer.example2;


/**
 * 具体观察者
 *
 * 当状态发生变化时，主动向观察者发出通知
 *
 * */
public class Transport extends AbstractWatched {

    @Override
    public void start() {
        System.out.println("运钞车启动出发，告知各个观察者");
        notifyWatchers();
        System.out.println("通知完毕，观察者做出反应结束");
    }

}
