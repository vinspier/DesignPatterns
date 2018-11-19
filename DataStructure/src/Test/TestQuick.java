package Test;

import SortAlgorithm.QuickSort;

public class TestQuick {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        Integer[] data = new Integer[100];
        for(int i=0; i<data.length; i++){
            data[i] = data.length-i;
        }
//        Integer[] data = {32,43,23,13,5};
        quickSort.sort2(data,0,data.length-1);
        for(int i=0; i<data.length; i++){
            System.out.print("  "+data[i]);
        }
    }
}
