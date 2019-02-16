package com.fxb.patterns.decorator.example;

/**
 * 具有装饰功能的装饰者类
 * 装饰边框的抽象类
 *
 * 通过继承被装饰者 使得装饰类与被装饰类具有相同的方法
 * 保持装饰者与被装饰者的一致性
 * */
public abstract class Border extends Display{
    protected Display display;//被装饰者

    /** 生成实例时 通过参数指定 被装饰者 */
    protected Border(Display display) {
        this.display = display;
    }
}
