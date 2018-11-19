package SortAlgorithm;

public class ShellSort {
    private Integer[] shellData;
    /**groupCount需要分组排序每组的个数*/
    private int gc = 1;

    public ShellSort() {
    }

    public ShellSort(Integer[] shellData) {
        this.shellData = shellData;
    }

    public ShellSort(Integer[] shellData, int gc) {
        this.shellData = shellData;
        this.gc = gc;
    }

    public Integer[] sortData(){
        double startTime = System.currentTimeMillis();
        while(gc >= 1){
            shellSortData();
            gc /= 2;
        }
        double endTime = System.currentTimeMillis();
        System.out.println("排序总耗时---------------"+(endTime-startTime));
        return shellData;
    }

    public Integer[] sortData(Integer[] shellData){
        this.shellData = shellData;
        return sortData();
    }

    public Integer[] shellSortData(){
        if(shellData.length < 2) {
            return shellData;
        }else{
            for(int i = gc; i < shellData.length; i++){
                /**假如后面的插入数据大于前面对应的数据，则不必再做循环判断*/
                if(shellData[i-gc] > shellData[i]){
                    int j = i;
                    Integer temp = shellData[i];
                    for(; j >= gc && temp < shellData[j-gc]; j = j - gc){
                        shellData[j] = shellData[j-gc];
                    }
                    shellData[j] = temp;
                }
            }
        }
        return shellData;
    }



    public void printData(){
        for(int i=0; i<shellData.length; i++){
            if(i == shellData.length -1){
                System.out.println(shellData[i]);
            }else {
                System.out.print(shellData[i]+" ");
            }

        }
    }
    public void printData(Integer[] data){
        for(int i=0; i<data.length; i++){
            if(i == data.length -1){
                System.out.println(data[i]);
            }else {
                System.out.print(data[i]+" ");
            }

        }
    }

    public Integer[] getShellData() {
        return shellData;
    }

    public void setShellData(Integer[] shellData) {
        this.shellData = shellData;
    }

    public void setGc(int gc) {
        if(gc < 1 || gc > shellData.length){
            this.gc = 1;
        }
        this.gc = gc;
    }
}
