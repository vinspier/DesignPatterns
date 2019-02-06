package com.fxb.patterns.abstractFactory.example;

import java.util.Iterator;

/**
 * 具体零件类 形式2
 * */
public class TableTray extends Tray{
    public TableTray() {
        super();
    }

    public TableTray(String caption) {
        super(caption);
    }

    /** 具体零件的实现 形式2 */
    @Override
    public String makeHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<td>");
        sb.append("<table><tr>");
        sb.append("<td align=\"center\" colspan=\""+items.size()+"\">"+"<b>"+caption+"</b>"+"</td>" +"</tr>\n");
        sb.append("<tr>\n");
        Iterator<Item> it = items.iterator();
        while (it.hasNext()){
            sb.append(it.next().makeHtml());
        }
        sb.append("</tr></table>");
        sb.append("</td>");
        return sb.toString();
    }
}
