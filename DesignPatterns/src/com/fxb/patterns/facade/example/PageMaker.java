package com.fxb.patterns.facade.example;

import java.io.FileWriter;
import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * 窗口类 将程序中复杂的类之间的调用关系整合到一个接口中
 * 供不熟悉业务底层逻辑的调用者调用
 * */
public class PageMaker {

    private PageMaker() {
    }

    public static void makePage(String mail,String filename) throws Exception {
        Properties mailProps = PropertyUtil.getProperties("com/fxb/patterns/Facade/example/mailConfig");
        String username = mailProps.getProperty(mail);
        HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
        writer.makeTitle("欢迎来到 " + username + " 的主页");
        writer.makeParagraph("这是 " + username +" 的个人主页");
        writer.makeMailLink(mail,username);
        writer.close();
    }

    public static void makePage(String filename) throws Exception  {
        HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
        writer.makeTitle("邮件列表的主页");
        writer.makeParagraph("邮件列表的主页");
        Properties mailProps = PropertyUtil.getProperties("mailConfig");
        Enumeration enumeration = mailProps.propertyNames();
        while (enumeration.hasMoreElements()){
            String mail = (String) enumeration.nextElement();
            String username = mailProps.getProperty(mail ,"unknown");
            writer.makeMailLink(mail,username);
        }
        writer.close();
    }
}
