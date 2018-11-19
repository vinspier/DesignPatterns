package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println("");
        /**
         * 1 jdk源码中，当要新添加数据时 先判断位置在哪儿 若位置index 超出末尾或小于了  抛出错误
         *
         * 2 进行是否扩容判断（内含 操作次数记录+1）
         *
         * 调用System.arraycopy(elementData, index, elementData, index + 1,size - index);
         * 对源数据对象进行部分拷贝移位，
         *
         * 若新增元素位置index在末尾添加 则不做拷贝
         * 若在已有元素位置添加，会将从那个位置开始及往后数据进行copy 往后移位
         *
         * 最后将那个位置添加设置为目标数据
         * */
        list.add(1,4);
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println("");
        list.add(4,6);
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
    }
}
