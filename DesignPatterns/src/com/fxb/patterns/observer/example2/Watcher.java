package com.fxb.patterns.observer.example2;

/**
 * 主动观察者接口
 * 定义观察者的统一API
 * */
public interface Watcher {

    /**
     * 监听执行动作
     */
    void listen();

    /**
     * 注册被监听对象
     */
    void registerListen(Watched watched);

}
