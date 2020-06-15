package com.fxb.patterns.proxy.staticProxy;

/**
 *
 * 被代理类
 * 最后方法的实际执行者
 *
 * */
public class ProxiedClass implements ThemeInterface {
    @Override
    public String dealWith(String message) {
        System.out.println("实际目标对象的方法执行 ：" + message);
        return message.toUpperCase();
    }
}
