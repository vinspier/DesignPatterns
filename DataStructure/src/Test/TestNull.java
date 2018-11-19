package Test;

public class TestNull {
    public static void main(String[] args) {
        A s = null;
        System.out.println(s.print());
        if(s.equals("")){ // s为null 不属于任何一个对象
            System.out.println("true");
        }
    }
}
class A{
    public static String print(){  //被static修饰的方法以及变量 都在加载的时候已确认存储在 静态方法区中 不依赖对象的访问
        System.out.println("--------");
        return "*************";
    }
}
