package com.fxb.patterns.proxy.dymaic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *使用动态代理的对象必须实现一个或多个接口
 * 实现JDK动态代理需要实现自己的handler
 * 增强的方法定义在此处理类中
 *
 * */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    /** 增强方法 */
    private void before(){
        System.out.println("预处理前-------------"+System.currentTimeMillis());
    }

    /** 增强方法 */
    private void after(){
        System.out.println("处理后---------------"+System.currentTimeMillis());
    }
}
