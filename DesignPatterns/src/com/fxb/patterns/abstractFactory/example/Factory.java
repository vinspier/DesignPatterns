package com.fxb.patterns.abstractFactory.example;

/**
 * 抽象工厂类
 * */
public abstract class Factory {

    /** 静态方法 创建具体的工厂实例入口 */
    public static Factory getFactory(String className){
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("未找到 " + className + " 类");
        }
        return factory;
    }

    /** 定义创建 具体的零件/产品的实例接口  */
    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);

}
