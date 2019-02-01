package com.fxb.patterns.prototype.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体原型类
 * 实现具体的复制方法 默认是浅复制
 * 若需要实现深复制 重写clone方法 将数组、集合、对象应用的成员变量再次克隆
 * */
public class MessageBox implements Product  {

    /**
     *  基本类型 在复制时 默认的Object中clone会将 基本类型数据的值进行拷贝
     *  数组、集合、对象引用的成员变量拷贝他们的引用，并不会拷贝他们内部的值
     * */
    private String charType;
    private int[] array = {0,1,2,3,4,5,6,7,8,9};
    private ArrayList<String> list = new ArrayList<>();

    public MessageBox(String charType) {
        this.charType = charType;
    }

    @Override
    public void use() {
        System.out.println("****************************************************");
        System.out.println(charType);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("****************************************************");
    }

    @Override
    public Product copy(){
        try {
            return (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 重写clone方法
     * Object类中的clone方法是浅复制
     * 若需要进行深复制 必须重写该方法
     * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        MessageBox p = null;
        p = (MessageBox)super.clone();
        /** 数组/集合/对象类型的成员变量 必须重新进行复制 否则只会进行浅复制 */
        p.array = this.array.clone();
        p.list = (ArrayList<String>) this.list.clone();
        return p;
    }

    public String getCharType() {
        return charType;
    }

    public void setCharType(String charType) {
        this.charType = charType;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

}
