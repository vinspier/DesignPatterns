package com.fxb.patterns.factory.example;

/**
 * 定义工厂的对调用开放的方法
 * */
public interface Creatable<T> {
    T create();
}
