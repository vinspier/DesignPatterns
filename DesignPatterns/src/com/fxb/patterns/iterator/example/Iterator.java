package com.fxb.patterns.iterator.example;

/**
 * 抽象迭代器接口 定义方法
 * */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
