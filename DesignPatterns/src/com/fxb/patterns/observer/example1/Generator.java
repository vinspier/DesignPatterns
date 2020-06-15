package com.fxb.patterns.observer.example1;

/**
 *
 * 被观察者对象接口
 * 定义公用接口API
 * */
public interface Generator {
    /** 注册观察者 */
    void put(Observer observer);
    /** 移除观察者 */
    void remove(Observer observer);
    /** 发生变动事件 */
    void change();
    /** 并通知观察者 */
    void notifyObservers();
    /** 获取数据 */
    int getNo();
}
