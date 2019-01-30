package com.fxb.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        Iterator iterator = integers.listIterator(5);
        while (iterator.hasNext()){
            Integer i = (Integer)iterator.next();
            if(i == 1) {
                iterator.remove();
            }
        }
        System.out.println(integers.size());

        for(int i = 0; i < integers.size(); i++){
            if(integers.get(i) == 1 || integers.get(i) == 2 ){
                integers.remove(i);
            }
        }
        System.out.println(integers.size());
   }

}
