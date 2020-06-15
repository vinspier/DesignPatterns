package com.fxb.patterns.observer.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 被观察者抽象类
 * 抽象出被观察者的共性属性以及行为
 *
 * */
public abstract class NumberGenerator implements Generator {

    /**
     * 观察者对象的存储空间
     * 实际中可存储于数据库中（非/关系型）
     *  */
    private List<Observer> observers = new ArrayList<Observer>();

    protected int no;

    @Override
    public void put(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 主动通知观察者
     * */
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()){
            it.next().update(this);
        }
    }

    @Override
    public int getNo() {
        return no;
    }

    /**
     * 被观察者对象的事件改变
     * 具体实现子类完成
     * */
    public abstract void change();
}
