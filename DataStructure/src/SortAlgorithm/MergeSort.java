package SortAlgorithm;

public class MergeSort {
    /**对需要排序的数组进行分组*/
    public void sort(Integer[] data,int str,int end){
        if(str < end){
            int mid = (str + end) / 2;
            sort(data,str,mid);
            sort(data,mid+1,end);
            subSort(data,str,mid,end);
        }
    }
    private void subSort(Integer[] data,int str,int mid,int end){
        Integer[] assist = new Integer[data.length];
        int assistStart = str;
        int i = str;int j = mid + 1;
        int resetIndex = str;
        while(i <= mid && j <= end){
            if(data[i] <= data[j]){
                assist[assistStart++] = data[i++];
            }else{
                assist[assistStart++] = data[j++];
            }
        }
        while(i <= mid){
            assist[assistStart++] = data[i++];
        }
        while(j <= end){
            assist[assistStart++] = data[j++];
        }

        /**辅助数组中已排好序复制回原数组*/
        while(resetIndex <= end){
            data[resetIndex] = assist[resetIndex++];
        }
    }

    public void printData(Integer[] data){
        for(int i=0; i<data.length; i++){
            if(i == data.length-1) {
                System.out.println(" "+data[i]);
            }else{
                System.out.print(" "+data[i]);
            }
        }
    }
}
