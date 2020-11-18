package com.fxb.patterns.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    public static void main(String[] args) {
        testAtomicInteger();
    }

    public static void test(){
        for (int i = 0; i < 100; i++){
            if ((i & 1) == 1){
                System.out.println(i);
            }
        }
    }

    public static void test1(int n){
        System.out.println(n + (n >>> 1) + 1);
    }

    public static void testConcurrentHashMap(){
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
//        ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>(13);
        System.out.println(map.size());
        for (Integer i = 0 ; i < 17;i++){
            map.put(i.toString(),i);
        }
        System.out.println(map.size());
    }

    public static void testAtomicInteger(){
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());
    }

}
