package SortAlgorithm;

public class SelectSort {
    private Integer[] selectData;

    public SelectSort() {
    }

    public SelectSort(Integer[] selectData) {
        this.selectData = selectData;
    }

    public Integer[] sortData(){
        double startTime = System.currentTimeMillis();
        if( null != selectData && selectData.length < 2){
            return selectData;
        }
        for(int i = 0; i < selectData.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < selectData.length; j++){
                if(selectData[j] < selectData[i]){
                    minIndex = j;
                }
            }
            Integer temp = selectData[i];
            selectData[i] = selectData[minIndex];
            selectData[minIndex] = temp;
        }
        double endTime = System.currentTimeMillis();
        System.out.println("排序总耗时---------------"+(endTime-startTime));
        return selectData;
    }
    public Integer[] sortData(Integer[] selectData){
        this.selectData = selectData;
       return sortData();
    }

    public void printData(){
        for(int i=0; i<selectData.length; i++){
            if(i == selectData.length -1){
                System.out.println(selectData[i]);
            }else {
                System.out.print(selectData[i]+" ");
            }

        }
    }

    public Integer[] getSelectData() {
        return selectData;
    }

    public void setSelectData(Integer[] selectData) {
        this.selectData = selectData;
    }
}
