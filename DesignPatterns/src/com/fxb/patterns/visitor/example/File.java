package com.fxb.patterns.visitor.example;

/**
 * 内容类 也就是最小单位的类
 * 在此模式中也是属于 最小单位的元素类
 * */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        return null;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
