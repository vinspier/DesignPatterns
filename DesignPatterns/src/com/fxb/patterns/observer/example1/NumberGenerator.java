package com.fxb.patterns.observer.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator implements Generator {

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
    protected void notifyObservers() {
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
     * 别观察者对象的状态改变
     * 具体实现子类完成
     * */
    public abstract void change();
}
