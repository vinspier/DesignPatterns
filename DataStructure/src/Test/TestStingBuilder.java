package Test;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class TestStingBuilder {
    public static void main(String[] args) throws NoSuchFieldException,IllegalAccessException{
        StringBuilder test = new StringBuilder(6);/**初始化值大小为4*/
        Class testBuilder = test.getClass().getSuperclass();
        Field field = testBuilder.getDeclaredField("value");
        field.setAccessible(true);
        char[] fileValue = (char[]) field.get(test);
        for(int i=0; i<fileValue.length; i++){
            System.out.print("第"+i+"个值是"+fileValue[i]);
        }
        System.out.println();
        test.append(1);
        test.append(2);
        test.append(3);
        test.append(4);


        for(int i=0; i<fileValue.length; i++){
            System.out.print("   "+fileValue[i]);
        }
        System.out.println("内部value长度"+fileValue.length);
        String s = "5678901";
        /** 内部char【4】，添加s的时候  count(4) < count(4 + 7) 进行扩容
         * 又因为 （4 + 1）* 2  <  11  最后 count = 11
         * 在进行内容拷贝
         */
        test.append(s);
        char[] fileValue1 = (char[]) field.get(test);
        System.out.println("内部value长度"+fileValue1.length);


/*        String s = "abc";
        Class stringClass = s.getClass();
        Field field = stringClass.getDeclaredField("value");
        field.setAccessible(true);
        char[] value = (char[])field.get(s);
        System.out.println(value.length);*/
    }
}
