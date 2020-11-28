package com.fxb.patterns.singleton.example;

/**
 * 单例模式二
 * 静态代码块 线程安全
 * */
public class SingletonB {
    /**
     * 定义成静态类变量 当第一次访问该变量时 促使类被加载并初始化该变量
     * */
    private static SingletonB instance;

    /** 构造器私有化 禁止除了以下的入口外其他方法产生实例 */
    private SingletonB() {
        if(instance != null){
            throw new RuntimeException("单例已存在,不允许反射方式创建实例");
        }
    }

    /** 静态代码块 当类被初始加载的时候 初始化该实例 */
    static {
        instance = new SingletonB();
    }

    /** 对外开发 生成实例的唯一入口 */
    public static SingletonB createInstance(){
        return instance;
    }

}
