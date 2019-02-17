package com.fxb.patterns.Test;


import java.util.Arrays;

/** 测试函数式编程 */
public class TestFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        /** 原编程方式 */
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0)
                arr[i]++;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("####################################");
        /** 函数式 */
        Arrays.stream(arr).map(x->(x % 2 == 0 ? x : x + 1 )).forEach(System.out::print);

    }
}
