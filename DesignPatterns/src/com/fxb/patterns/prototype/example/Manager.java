package com.fxb.patterns.prototype.example;


import java.util.HashMap;
import java.util.Map;

/**
 * 注册中心管理类
 * 将不同的原型类注册到此类中，
 * 调用者可以通过该类复制出已保持的任何一个实例的副本
 * */
public class Manager {
    private Map<String,Product> dataMap = new HashMap<>();

    /** 注册原型实例 */
    public void register(String name,Product obj){
        dataMap.put(name,obj);
    }

    /** 根据名字 创建出目标对象实例 */
    public Object copy(String name){
        Product obj = dataMap.get(name);
        Product copy = obj.copy();
        return copy;
    }
}
