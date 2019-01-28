package com.fxb.patterns.adapter.example;

/**
 * 功能已经测试过的现有的组件类
 * 此类 只能以组件形式提供 不可修改
 * 如第三方的api jdk的接口
 * */
public class Calculator {

    public Calculator() {
    }

    /**  该类计算 0 到 指定的数number 所有数之和 */
    public int calculate(int number){
        if(number < 0) {
            System.out.println("输入需要被计算的值不能小于0");// 实际中定义异常抛出
            return -1;
        }
        int sum = 0;
        for(int i = 0; i < number; i++){
            sum += i;
        }
        return sum;
    }
}
