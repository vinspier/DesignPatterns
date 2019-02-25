package com.fxb.patterns.observer.example2;

/**
 * 被观察者接口
 * 定义被观察者的统一API
 *
 * 增加、删除、通知观察者
 * */
public interface Watched {

    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers();

    void start();
}
