package SortAlgorithm;

public class SimpleCountSort {

    public  void sort(Integer[] data){
        /**辅助桶 用来存储对应数值出现的次数*/
        Integer[] bucketData = new Integer[1000];
        for(int i=0; i<bucketData.length; i++){
            bucketData[i] = 0;
        }
        for(int j=0; j<data.length; j++){
            bucketData[data[j]]++;
        }
        for(int k=0; k<bucketData.length; k++){
            for(int i=0; i<bucketData[k]; i++){
                System.out.print(" " + k);
            }
        }
    }

}
