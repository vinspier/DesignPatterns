package com.fxb.patterns.visitor.example;

import java.util.Iterator;

/**
 * 是容器和内容的统一抽象类
 * 在此模式中 也是抽象的元素类
 * */
public abstract class Entry implements Visitable{
    public abstract String getName();
    public abstract int getSize();
    protected Entry parent;

    public Iterator<Entry> iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    /** add方法只有容器可以使用 所以有好几种方式可以实现 */
    //方式1 在顶层抽象类中 定义 抛出异常 让容器子类去继承并重写该方法
    public Entry add(Entry entry) throws FileTreatmentException {
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

    public String getFullName(){
        StringBuilder fileName = new StringBuilder();
        Entry entry = this;
        do {
            fileName.insert(0,"/" + entry.getName());
            entry = entry.parent;
        }while (entry != null);
        return fileName.toString();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

}
