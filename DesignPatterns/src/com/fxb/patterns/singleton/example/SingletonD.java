package com.fxb.patterns.singleton.example;

/**
 * 单例模式四
 * 懒汉 同步产生实例的入口 线程安全
 * */
public class SingletonD {
    /**
     * 定义成静态类变量 当第一次访问该变量时 促使类被加载并初始化该变量
     * final 需要时可以静止指令重排序 在定义是必须被赋值
     * */
    private static SingletonD instance;

    /** 构造器私有化 禁止除了以下的入口外其他方法产生实例 */
    private SingletonD() {
    }

    /** 对外开发 生成实例的唯一入口 对入口进行同步处理 保证线程安全 */
    public static synchronized SingletonD createInstance(){
        if (instance == null){
            instance = new SingletonD();
        }
        return instance;
    }

}
