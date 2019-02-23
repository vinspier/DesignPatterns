package com.fxb.patterns.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 *
 * 使用cglib代理的对象则无需实现接口，达到代理类无侵入。
 * */
public class ThemeFactory implements MethodInterceptor {

    private Object target;

    public ThemeFactory(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    /** 增强方法 */
    private void before(){
        System.out.println("开始方法前增强事务");
    }

    /** 增强方法 */
    private void after(){
        System.out.println("方法结束后增强事务");
    }

}
