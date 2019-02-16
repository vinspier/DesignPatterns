package com.fxb.patterns.decorator.example;

/**
 *增加功能时的核心角色
 *
 * 所有对象的基础抽象类 此后的增强装饰类 再次基础上继承
 * */
public abstract class Display {
    /** 获取 横向字符数*/
    public abstract int getColumns();
    /** 获取 纵向行数 */
    public abstract int getRows();
    /** 获取某一行字符串 */
    public abstract String getRowText(int row);
    /**  模板方法 最终全部显示 */
    public void show(){
        for (int i = 0; i < getRows(); i++){
            System.out.println(getRowText(i));
        }
    }
}
