package com.fxb.patterns.singleton.example;

public class SingletonUnsafe {
    private static SingletonUnsafe instance ;

    public SingletonUnsafe() {
    }
/**
    public static SingletonUnsafe createInstance(){
        if(instance == null){
            instance = new SingletonUnsafe();
        }
        return instance;
    }
*/

    public static SingletonUnsafe createInstance(){
        if(instance == null){
           synchronized (SingletonUnsafe.class){
               instance = new SingletonUnsafe();
           }
        }
        return instance;
    }

}
