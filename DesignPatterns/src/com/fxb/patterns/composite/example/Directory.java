package com.fxb.patterns.composite.example;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 容器类 可添加内容或者子容器
 * */
public class Directory extends Entry {

    private String name;
    private ArrayList<Entry> diretories = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    /** 递归计算出文件的大小 */
    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> iterator = diretories.iterator();
        while (iterator.hasNext()){
            Entry entry = iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        diretories.add(entry);
        entry.parent = this;// 保存父级关系
        return this;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> iterator = diretories.iterator();
        while (iterator.hasNext()){
            Entry entry = iterator.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
