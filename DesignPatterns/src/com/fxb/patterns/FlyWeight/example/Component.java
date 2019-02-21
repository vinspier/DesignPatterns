package com.fxb.patterns.FlyWeight.example;

/**
 *
 * 实例共享类
 * 需要被大量创建 而且对象的实际内容值是相同的
 * 例如窗口的组件类、字符类
 * */
public class Component {

    private String name;
    private String value;

    public Component(String name) {
        this.name = name;
        this.value = name;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
