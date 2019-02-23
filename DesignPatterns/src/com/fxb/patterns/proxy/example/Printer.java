package com.fxb.patterns.proxy.example;

/**
 *
 * 真实主体类
 * */
public class Printer implements  Printable{

    private String content;

    public Printer() {
        initial();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /** 真实主体类的方法 */
    public void print(){
        System.out.println("    ====== 真实主体方法开始 ======");
        System.out.println("    真实主体内容：" + content);
        System.out.println("    ====== 真实主体方法结束 ======");
    }

    private void initial(){
        try {
            System.out.println("    真实主体类实例生成中...");
            Thread.sleep(1000);
            System.out.println("        .");
            Thread.sleep(1000);
            System.out.println("        .");
            Thread.sleep(1000);
            System.out.println("        .");
            System.out.println("    实例创建完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
