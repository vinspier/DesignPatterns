package com.fxb.patterns.adapter.simple;


/**
 * 具体目标类
 *     继承提供的组件类，结合自己的方法和组件已有的方法
 * 来实现特定需要的方法
 * */
public class PrintExtend extends Calculator implements Print{

    public PrintExtend(){

    }

    /** 需要事项的目标方法 打印 0 到 输入值number的总和值 和 顺序打印每一项的值*/
    @Override
    public void printCalculate(int number) {
        System.out.println(calculate(number));
        printValue(number);
    }

    /** 此类定义的特定方法 打印 0 到 number的值 */
    public void printValue(int number){
        for(int i = 1; i <= number; i++){
            System.out.print(i + " ");
        }
    }
}
