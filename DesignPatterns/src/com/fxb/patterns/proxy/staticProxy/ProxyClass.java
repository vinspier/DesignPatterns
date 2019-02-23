package com.fxb.patterns.proxy.staticProxy;

/**
 * 代理类
 * 增强被代理类的方法
 * （日志创建、用户校验、、、）
 * */
public class ProxyClass implements ThemeInterface {
    private ThemeInterface themeInterface;

    public ProxyClass(ThemeInterface themeInterface) {
        this.themeInterface = themeInterface;
    }

    @Override
    public String dealWith(String message) {
        message = before(message);
        String result = themeInterface.dealWith(message);
        after(message);
        return result;
    }

    private String before(String message){
        message = "before " + message;
        System.out.println("增强实际方法处理前---------"+ message);
        return message;
    }

    private String after(String message){
        message = message + " after";
        System.out.println("增强实际方法处理后---------"+ message);
        return message;
    }
}
