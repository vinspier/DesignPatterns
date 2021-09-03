package com.fxb.patterns.observer.example2;

/**
 * 抽象观察者
 *
 * 抽取定义公共方法
 *
 * @author  vinspier
 * @date    2021/9/2 8:17 下午
 * @version 1.0
*/
public abstract class AbstractWatcher implements Watcher{

    /**
     * 被观察者目标
     * */
    private Watched watched;

    /**
     * 注入被观察者
     */
    public void registerListen(Watched watched) {
        this.watched = watched;
    }

}
