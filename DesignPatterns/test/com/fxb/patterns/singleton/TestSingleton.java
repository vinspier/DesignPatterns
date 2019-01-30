package com.fxb.patterns.singleton;

import com.fxb.patterns.singleton.example.*;

public class TestSingleton {
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++){
            Thread t = new Thread(new Runnable() {

                SingletonUnsafe a = SingletonUnsafe.createInstance();

                @Override
                public void run() {
                    SingletonUnsafe aa = SingletonUnsafe.createInstance();
                    if(! (a == aa)){
                        System.out.println(a == aa);
                    }
                }

            });
            t.start();
        }
        System.out.println("----------------------------------------------------------------");
        for(int i = 0; i < 5; i++){
            Thread t = new Thread(new Runnable() {

                SingletonA a = SingletonA.createInstance();

                @Override
                public void run() {
                    SingletonA aa = SingletonA.createInstance();
                    System.out.println(a == aa);
                }

            });
            t.start();
        }
        for(int i = 0; i < 5; i++){
            Thread t = new Thread(new Runnable() {

                SingletonB b = SingletonB.createInstance();

                @Override
                public void run() {
                    SingletonB bb = SingletonB.createInstance();
                    System.out.println(b == bb);
                }

            });
            t.start();
        }
        for(int i = 0; i < 5; i++){
            Thread t = new Thread(new Runnable() {

                SingletonC a = SingletonC.createInstance();

                @Override
                public void run() {
                    SingletonC aa = SingletonC.createInstance();
                    System.out.println(a == aa);
                }

            });
            t.start();
        }
        for(int i = 0; i < 5; i++){
            Thread t = new Thread(new Runnable() {

                SingletonD a = SingletonD.createInstance();

                @Override
                public void run() {
                    SingletonD aa = SingletonD.createInstance();
                    System.out.println(a == aa);
                }

            });
            t.start();
        }
        for(int i = 0; i < 5; i++){
            Thread t = new Thread(new Runnable() {

                SingletonE a = SingletonE.createInstance();

                @Override
                public void run() {
                    SingletonE aa = SingletonE.createInstance();
                    System.out.println(a == aa);
                }

            });
            t.start();
        }
    }
}
