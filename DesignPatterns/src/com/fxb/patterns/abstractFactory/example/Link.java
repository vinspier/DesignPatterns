package com.fxb.patterns.abstractFactory.example;

/**
 * 抽象零件类Link
 * */
public abstract class Link extends Item{
    protected String url;

    public Link() {
    }

    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
