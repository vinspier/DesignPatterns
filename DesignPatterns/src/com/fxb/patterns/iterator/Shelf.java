package com.fxb.patterns.iterator;

/**
 * 定义书架的共有功能
 * */
public interface Shelf<T> {

    void append(T t);
    T getBookAt(int index);
    T remove(int index);
    int count();
    Iterator<T> iterator();
}
