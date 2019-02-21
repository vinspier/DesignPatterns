package com.fxb.patterns.FlyWeight.example;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 实例工厂类 单例模式
 * 管理共享实例的创建、删除等
 * 通过 hashMap 来实现 实例的唯一性，不重复性
 *
 * */
public class ComponentFactory {

    private static ComponentFactory factory = new ComponentFactory();
    private Map<String,Component> pool = new HashMap<String, Component>();

    private ComponentFactory() {

    }

    /** 创建工厂 */
    public static ComponentFactory build(){
        return factory;
    }

    /** 通过指定名称 获取组件 */
    public synchronized Component create(String name){
        Component component = pool.get(name);
        if (component == null){
            Component c = new Component(name);
            pool.put(name,c);
            component = c;
        }
        return component;
    }

    public synchronized Component delete(String name){
        Component component = pool.remove(name);
        return  component;
    }

}
