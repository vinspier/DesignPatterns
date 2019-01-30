package com.fxb.patterns.singleton.example;

public class SingletonUnsafe {
    private static SingletonUnsafe instance ;

    private SingletonUnsafe() {
        slowDown();
    }

    public static SingletonUnsafe createInstance(){
        if(instance == null){
            instance = new SingletonUnsafe();
        }
        return instance;
    }

/**
    public static SingletonUnsafe createInstance(){
        if(instance == null){
           synchronized (SingletonUnsafe.class){
               instance = new SingletonUnsafe();
           }
        }
        return instance;
    }
*/

 private void slowDown(){
     try {
         Thread.sleep(3000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}
