package SortAlgorithm;

public class InsertSort {
    private Integer[] targetData;

    public InsertSort(Integer[] targetData) {
        this.targetData = targetData;
    }

    public void printData(){
        for(int i=0; i<targetData.length; i++){
            if(i == targetData.length -1){
                System.out.println(targetData[i]);
            }else {
                System.out.print(targetData[i]+" ");
            }

        }
    }
    public Integer[] sortData(){
        double startTime = System.currentTimeMillis();
        if(targetData.length < 2){
            return targetData;
        }else{
            for(int i=1; i<targetData.length; i++){
                Integer x = targetData[i];/**辅助存储*/
                int j=i;// 设置哨兵
                for(; j>=1 && targetData[j-1] > x; j--){
                    targetData[j] = targetData[j-1];
                }
                targetData[j] = x;
            }
        }
        double endTime = System.currentTimeMillis();
        System.out.println("排序总耗时---------------"+(endTime-startTime));
        return targetData;
    }

    public Integer[] getTargetData() {
        return targetData;
    }
}
