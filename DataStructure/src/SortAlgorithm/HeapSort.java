package SortAlgorithm;

public class HeapSort {
    private Integer[] data;

    public HeapSort() {
    }

    public HeapSort(Integer[] data) {
        this.data = data;
    }

    public void sort(Integer[] arr){
        //构建第一个初始大/小顶堆
        for(int i=arr.length/2-1; i>=0; i--){
            adjustSort(arr,i,arr.length);
        }
        //第一个节点与最后一个节点转换位置 需要循环length - 1 次
        for(int i=arr.length-1; i>0; i--){
            swap(arr,0,i);
            adjustSort(arr,0,i);
        }

    }

    public void adjustSort(Integer[] arr,int str,int len){
        Integer temp = arr[str];
        for(int next = 2 * str + 1; next < len;){ // 从第一个非叶子结点开始 往下判断其子节点
            if(next + 1 < len && arr[next] < arr[next + 1]){ //存在右子节点 左子节点小于右子节点
                next++;
            }
            if(arr[next] > temp){ // 子节点中 最大的与父节点比较
                arr[str] = arr[next];
                arr[next] = temp;
                str = next;
            }else {
                break;
            }
        }
    }

    public void swap(Integer[] arr,int target,int dst){
        Integer temp = arr[target];
        arr[target] = arr[dst];
        arr[dst] = temp;
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

    public Integer[] getData() {
        return data;
    }

    public void setData(Integer[] data) {
        this.data = data;
    }
}
