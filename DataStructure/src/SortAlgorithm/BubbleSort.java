package SortAlgorithm;

public class BubbleSort {
    public Integer[] sort(Integer[] data){
        if(null != data && data.length < 2){
            return data;
        }else if(null != data && data.length > 1){
            for(int i=0; i<data.length-1;i++){
                for(int j=0; j<data.length-i-1; j++){
                    if(data[j] > data[j+1]){
                        Integer temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                    }
                }
            }
        }
        return data;
    }
    public void printData(Integer[] data){
        for(int i=0; i<data.length; i++){
            if(i == data.length-1){
                System.out.println(" "+data[i]);
            }else{
                System.out.print(" "+data[i]);
            }
        }
    }
}
