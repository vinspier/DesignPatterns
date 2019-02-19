package com.fxb.patterns.facade.example;

import java.io.Writer;

/**
 *
 * 需要被窗口调用的底层复杂关系类
 * */
public class HtmlWriter {

    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }


    public void makeTitle(String title) throws Exception{
        writer.write("<html><head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>");
    }

    public void makeParagraph(String msg) throws Exception {
        writer.write("<p>" + msg + "</p>");
    }

    public void makeLink(String href,String caption) throws Exception {
        makeParagraph("<a href=\"" + href + "\">" + caption + "</a>" );
    }

    public void makeMailLink(String mail,String username) throws Exception {
        makeLink(mail,username);
    }

    public void close() throws Exception {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }

}
