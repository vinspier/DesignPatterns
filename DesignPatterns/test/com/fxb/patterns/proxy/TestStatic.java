package com.fxb.patterns.proxy;

import com.fxb.patterns.proxy.staticProxy.ProxiedClass;
import com.fxb.patterns.proxy.staticProxy.ProxyClass;

public class TestStatic {
    public static void main(String[] args) {
        ProxiedClass proxied = new ProxiedClass();
        ProxyClass proxy = new ProxyClass(proxied);
        proxy.dealWith("you never be alone !");
    }
}
