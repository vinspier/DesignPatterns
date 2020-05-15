package com.fxb.patterns.observer.example1;

/**
 * 观察者API
 * */
public interface Observer {
    /** 获取被观察者变更的事件信息 */
    void update(Generator generator);
}
