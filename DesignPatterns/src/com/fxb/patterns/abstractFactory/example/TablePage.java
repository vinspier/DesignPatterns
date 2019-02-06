package com.fxb.patterns.abstractFactory.example;

import java.util.Iterator;

/**
 * 具体产品类 形式2
 * */
public class TablePage extends Page {
    public TablePage() {
    }

    public TablePage(String title, String author) {
        super(title, author);
    }

    /** 具体产品的实现 形式2 */
    @Override
    public String makeHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>" + "</title></head></html>\n");
        sb.append("<body>\n");
        sb.append("<h1>"+title+"</h1>\n");
        sb.append("<table>\n");
        Iterator<Item> it = items.iterator();
        while (it.hasNext()){
            sb.append(it.next().makeHtml());
        }
        sb.append("</table>\n");
        sb.append("<hr><address>"+author+"</address></hr>");
        sb.append("</body>\n");
        return sb.toString();
    }
}
