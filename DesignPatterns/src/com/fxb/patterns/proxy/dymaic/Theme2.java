package com.fxb.patterns.proxy.dymaic;

/**
 *
 * 真实主体被代理类
 * */
public class Theme2 implements ThemeInterface2 {
    private static String message = "adfajfjf522525";
    @Override
    public String write() {
        System.out.println(this.message);
        return message;
    }
}
