package com.fxb.patterns.iterator.example;

/**
 * 定义书架的共有功能
 * */
public interface Shelf<T> extends Iterable{

    void append(T t);
    T getBookAt(int index);
    T remove(int index);
    int count();

    @Override
    Iterator iterator();
}
