package SortAlgorithm;

public class TestSort {
    public static void main(String[] args) {
        Integer[] data = new Integer[1000];
        for(int i=0; i<data.length; i++){
            data[i] = data.length - i;
        }
        Integer[] data1 = new Integer[1000];
        for(int i=0; i<data1.length; i++){
            data1[i] = data1.length - i;
        }
        Integer[] data2 = new Integer[1000];
        for(int i=0; i<data2.length; i++){
            data2[i] = data2.length - i;
        }
        Integer[] data3 = new Integer[1000];
        for(int i=0; i<data3.length; i++){
            data3[i] = data3.length - i;
        }
        Integer[] data4 = new Integer[1000];
        for(int i=0; i<data4.length; i++){
            data4[i] = data4.length - i;
        }
        Integer[] data5 = new Integer[1000];
        for(int i=0; i<data5.length; i++){
            data5[i] = data5.length - i;
        }
        Integer[] data6 = new Integer[1000];
        for(int i=0; i<data6.length; i++){
            data6[i] = data6.length - i;
        }
        Integer[] data7 = new Integer[1000];
        for(int i=0; i<data7.length; i++){
            data7[i] = data7.length - i;
        }
        Integer[] data8 = new Integer[999];
        for(int i=0; i<data8.length; i++){
            data8[i] = data8.length - i;
        }

        System.out.println("直接插入排序测试-------------------------------");
        /**直接插入排序测试*/
        InsertSort insertSort = new InsertSort(data);
        insertSort.printData();
        insertSort.sortData();
        insertSort.printData();
        System.out.println("希尔插入排序测试-------------------------------");

        /**希尔插入排序测试*/
        ShellSort shellSort = new ShellSort(data1);
        shellSort.printData();
        // shellSort.setGc(10);
        shellSort.sortData();
        shellSort.printData();
        System.out.println("设置分组因子-------------------------------");

        shellSort.setGc(6);
        shellSort.printData(data2);
        shellSort.sortData(data2);
        shellSort.printData(data2);
        System.out.println("选择排序测试-------------------------------");
        /**选择排序测试*/
        SelectSort selectSort = new SelectSort(data3);
        selectSort.printData();
        selectSort.sortData();
        selectSort.printData();
        System.out.println("堆排序测试-------------------------------");

        /**堆排序测试*/
        HeapSort heapSort = new HeapSort();
        heapSort.printData(data4);
        heapSort.sort(data4);
        heapSort.printData(data4);
        System.out.println("冒泡排序测试-------------------------------");

        /**冒泡排序测试*/
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.printData(data5);
        bubbleSort.sort(data5);
        bubbleSort.printData(data5);
        System.out.println("快速排序测试-------------------------------");

        /**快速排序测试*/
        QuickSort quickSort = new QuickSort();
        quickSort.printData(data6);
        quickSort.sort1(data6,0,data6.length-1);
        quickSort.printData(data7);
        System.out.println("归并排序测试-------------------------------");

        /**归并排序测试*/
        MergeSort mergeSort = new MergeSort();
        mergeSort.printData(data7);
        mergeSort.sort(data7,0,data7.length-1);
        mergeSort.printData(data7);
        System.out.println("简单计数排序测试-------------------------------");

        /**简单计数排序测试*/
        SimpleCountSort countSort = new SimpleCountSort();
        countSort.sort(data8);

        System.out.println("基数排序测试-------------------------------");
        /**基数排序测试*/


    }
}
