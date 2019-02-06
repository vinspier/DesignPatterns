package com.fxb.patterns.abstractFactory.example;

/**
 * 具体零件类 形式1
 * */
public class ListLink extends Link {
    public ListLink() {
    }

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    /** 具体零件的实现 形式1*/
    @Override
    public String makeHtml() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
