package SortAlgorithm;

public class QuickSort {
    public void quickSort(Integer[]a,int start,int end){
        if(start<end){
            int baseNum=a[start];//选基准值
            int midNum;//记录中间值
            int i=start;
            int j=end;
            do{
                while((a[i]<baseNum)&&i<end){
                    i++;
                }
                while((a[j]>baseNum)&&j>start){
                    j--;
                }
                if(i<=j){
                    midNum=a[i];
                    a[i]=a[j];
                    a[j]=midNum;
                    i++;
                    j--;
                }
            }while(i<=j);
            if(start<j){
                quickSort(a,start,j);
            }
            if(end>i){
                quickSort(a,i,end);
            }
        }
    }
    public void sort1(Integer[] a,int low,int high){
        if(low < high) {
            int mid = quickSort1(a, low, high);
            sort1(a, low, mid - 1);
            sort1(a, mid + 1, high);
        }
    }
    public void sort2(Integer[] a,int low,int high){
        if(low < high) {
            int mid = quickSort2(a, low, high);
            sort2(a, low, mid - 1);
            sort2(a, mid + 1, high);
        }
    }

    private int quickSort1(Integer[] a,int low,int high){
        Integer temp = a[low];
        while(low < high){
            while (low < high && a[high] >= temp){
                high--;
            }
            a[low] = a[high];
            while(low < high && a[low] <= temp){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = temp;
        return low;
    }

    private int quickSort2(Integer[] a,int low,int high){
        int i = low;
        int j = high;
        while(i < j){
            Integer benchMark = a[low];
            Integer temp = null;
            while(i < j){
                while(a[i] < benchMark){ /**从左往右遍历，若当前元素比基准数大 则准备交换位置*/
                    i++;
                }
                while(a[j] > benchMark){ /**从右往左遍历，若当前元素比基准数小，则准备交换位置*/
                    j--;
                }
                if(i < j){ /**交换左 右位置*/
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return i;
    }

    public void printData(Integer[] data){
        for(int i=0; i<data.length; i++){
            if(i == data.length-1) {
                System.out.println(data[i]);
            }else{
                System.out.print(" "+data[i]);
            }
        }
    }
}
