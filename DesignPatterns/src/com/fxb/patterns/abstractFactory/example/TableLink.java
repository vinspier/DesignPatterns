package com.fxb.patterns.abstractFactory.example;

/**
 * 具体零件类 形式2
 * */
public class TableLink extends Link {
    public TableLink() {
        super();
    }

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    /** 具体零件的实现 形式2 */
    @Override
    public String makeHtml() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
