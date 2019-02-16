package com.fxb.patterns.composite.example;

/**
 * 是容器和内容的统一抽象类
 * */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    /** add方法只有容器可以使用 所以有好几种方式可以实现 */
    //方式1 在顶层抽象类中 定义 抛出异常 让容器子类去继承并重写该方法
    public  Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    //方式2 定义成抽象方法
    /*
    public abstract Entry add(Entry entry);
    */

    //方式3 定义但是不做任何操作
    /*
    public abstract Entry add(Entry entry);
    */

    // 或者直接 只定义在容器子类中

    /** add方法只有容器可以使用 所以有好几种方式可以实现 */
    public void printList(){
        printList("");
    }
    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
