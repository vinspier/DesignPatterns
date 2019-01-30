package com.fxb.patterns.singleton.example;

public class SingletonF {
    private static SingletonF instance ;

    public SingletonF() {
    }

    public static SingletonF createInstance(){
        if(instance == null){
            synchronized (SingletonF.class){
                instance = new SingletonF();
            }
        }
        return instance;
    }
}
