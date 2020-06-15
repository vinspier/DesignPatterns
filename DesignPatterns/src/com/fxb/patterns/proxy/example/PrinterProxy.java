package com.fxb.patterns.proxy.example;

public class PrinterProxy implements Printable {

    private String content;
    private Printer printer;//委托方式 保存真实实体类实例

    public PrinterProxy() {
    }

    /**
     * 代理类和实体类同时保存属性值
     * */
    @Override
    public synchronized void setContent(String content) {
        if (printer != null)
            printer.setContent(content);
        this.content = content;
    }

    /** 返回代理类的属性值 */
    @Override
    public synchronized String getContent() {
        return content;
    }


    /**
     * 此方法代表 代理类无法处理 只能交给真实实体类实例处理
     * */
    @Override
    public void print() {
        System.out.println("====== 代理方法开始 ======");
        before();
        create();
        printer.print();
        after();
        System.out.println("====== 代理方法结束 ======");
    }

    private synchronized void create(){
        if (printer == null) {
            printer = new Printer();
            printer.setContent(content);
        }
    }

    // 增强 被代理类的方法
    private void before(){
        System.out.println("before 增强方法");
    }

    // 增强 被代理类的方法
    private void after(){
        System.out.println("after 增强方法");
    }

}
