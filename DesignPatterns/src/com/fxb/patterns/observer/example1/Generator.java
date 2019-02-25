package com.fxb.patterns.observer.example1;

/**
 *
 * 观察对象接口，定义观察对象的公用接口API
 * */
public interface Generator {
    void put(Observer observer);
    void remove(Observer observer);
    void change();
    int getNo();
}
