package Test;

import SortAlgorithm.BubbleSort;

public class TestBubble {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] target = new Integer[100000];
        for(int i=0; i<target.length; i++){
            target[i] = 99999-i;
        }
        target = bubbleSort.sort(target);
        for(int i=0; i<target.length; i++){
            System.out.printf("  "+ target[i]);
        }
    }
}
