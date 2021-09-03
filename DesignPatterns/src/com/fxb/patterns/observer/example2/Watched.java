package com.fxb.patterns.observer.example2;

import java.util.List;

/**
 * 被观察者接口
 * 定义被观察者的统一API
 *
 * 增加、删除、通知观察者
 * */
public interface Watched {

    /**
     * 单个注册 观察者
     */
    void registerWatcher(Watcher watcher);

    /**
     * 批量注册 观察者
     */
    void registerWatchers(List<Watcher> watchers);

    /**
     * 注销 观察者
     */
    void removeWatcher(Watcher watcher);

    /**
     * 通知 观察者
     */
    void notifyWatchers();

}
