package com.fxb.patterns.proxy.staticProxy;

/**
 *
 * 主体接口 定义被代理类和代理类的统一接口API
 * 保持他们的一致性
 * */
public interface ThemeInterface {
    String dealWith(String message);
}
