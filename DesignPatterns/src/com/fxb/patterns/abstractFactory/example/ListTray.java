package com.fxb.patterns.abstractFactory.example;


import java.util.Iterator;

/**
 * 具体零件类 形式1
 * */
public class ListTray extends  Tray {
    public ListTray() {
        super();
    }

    public ListTray(String caption) {
        super(caption);
    }

    /** 具体实现 形式1 */
    @Override
    public String makeHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n" + caption + "<ul>\n");
        Iterator<Item> it = items.iterator();
        while (it.hasNext()){
            sb.append(it.next().makeHtml());
        }
        sb.append("</li>\n</u/>\n");
        return sb.toString();
    }
}
