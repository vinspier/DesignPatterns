package com.fxb.patterns.proxy;

import com.fxb.patterns.proxy.dymaic.*;

import java.lang.reflect.Proxy;

public class TestDynamic {
    public static void main(String[] args) {

        ThemeInterface1 proxied1 = new Theme1();
        ThemeInterface2 proxied2 = new Theme2();

        MyInvocationHandler handler1 = new MyInvocationHandler(proxied1);
        MyInvocationHandler handler2 = new MyInvocationHandler(proxied2);

        ThemeInterface1 proxy1 = (ThemeInterface1) Proxy.newProxyInstance(proxied1.getClass().getClassLoader(),proxied1.getClass().getInterfaces(),handler1);
        ThemeInterface2 proxy2 = (ThemeInterface2) Proxy.newProxyInstance(proxied2.getClass().getClassLoader(),proxied2.getClass().getInterfaces(),handler2);

        System.out.println(proxy1.getClass());
        System.out.println(proxy2.getClass());
        proxy1.read();
        proxy2.write();

    }
}
