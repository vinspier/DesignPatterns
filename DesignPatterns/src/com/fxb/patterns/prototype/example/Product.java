package com.fxb.patterns.prototype.example;

/**
 * 原型接口
 * 定义 实现了该接口的子类的通用方法 定义复制现有实例来生成新实例的方法
 * 继承cloneable接口 子类可以使用Object的clone方法进行复制操作
 * */
public interface Product extends Cloneable {
    void use();
    Product copy();
}
