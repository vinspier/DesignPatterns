package com.fxb.patterns.factory.example;


import java.util.ArrayList;
import java.util.List;

/**
 * 工厂抽象类 定义工厂内部的生产方法 具体实现交由子类完成
 * 可部分实现  例如实例的产生的步骤框架（采用了模板方法）
 * */
public abstract class BaseFactory implements Factory {

    protected List<BaseProduct> products = new ArrayList<BaseProduct>();

    /** 产生最终产品的流程框架 （产品实例不一定只有new操作） */
    /**    对象的创建进行了包装，任务交给工厂来完成，代替了原来的有使用者手动new创建。
     工厂创建目标对象是一个过程，并非只是一个操作，因为在创建目标对象的前可能还需要创建辅助功能对象或者其他的一些操作
     （初始化设置），这时候就需要嵌入模板方法模式*/
    @Override
    public BaseProduct create() {
        BaseProduct bp = createProduct();
        registerProduct(bp);
        return bp;
    }

    /** 首先 产生产品实例*/
    protected abstract BaseProduct createProduct();

    /** 在将产品提供给客户之前 必须先进行激活操作*/
    protected abstract void registerProduct(BaseProduct bp);

    public int getProductsSize() {
        return products.size();
    }
}
