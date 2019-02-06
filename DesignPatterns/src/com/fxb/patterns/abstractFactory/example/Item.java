package com.fxb.patterns.abstractFactory.example;

/**
 * 抽象零件的最上层抽象父类
 * */
public abstract class Item {
    protected String caption;

    public Item() {
    }

    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHtml();
}
