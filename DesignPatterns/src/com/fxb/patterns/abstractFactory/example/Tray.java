package com.fxb.patterns.abstractFactory.example;

import java.util.ArrayList;

/**
 * 抽象零件类Tray类
 * */
public abstract class Tray extends Item {
    protected ArrayList<Item> items = new ArrayList<Item>();

    public Tray() {
    }

    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        items.add(item);
    }
}
