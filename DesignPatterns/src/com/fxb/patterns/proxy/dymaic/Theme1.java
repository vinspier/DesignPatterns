package com.fxb.patterns.proxy.dymaic;

/**
 *
 * 真实主体被代理类
 * */
public class Theme1 implements ThemeInterface1 {
    private static String message = "message141341341341";
    @Override
    public String read() {
        System.out.println(this.message);
        return message;
    }
}
