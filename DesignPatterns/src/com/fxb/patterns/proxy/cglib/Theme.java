package com.fxb.patterns.proxy.cglib;

import com.fxb.patterns.proxy.dymaic.ThemeInterface1;

/**
 *
 * 真实主体被代理类
 * */
public class Theme implements ThemeInterface1 {
    private static String message = "message141341341341";
    @Override
    public String read() {
        System.out.println(this.message);
        return message;
    }
}
