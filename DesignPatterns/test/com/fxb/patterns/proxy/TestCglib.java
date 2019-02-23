package com.fxb.patterns.proxy;

import com.fxb.patterns.proxy.cglib.Theme;
import com.fxb.patterns.proxy.cglib.ThemeFactory;
import org.springframework.cglib.proxy.Enhancer;

public class TestCglib {
    public static void main(String[] args) {
        Theme theme = new Theme();
        ThemeFactory factory = new ThemeFactory(theme);
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(theme.getClass());
        //设置回调函数
        en.setCallback(factory);
        Theme proxy = (Theme)en.create();
        System.out.println(proxy.getClass());
        proxy.read();
    }
}
