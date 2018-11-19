package Test;

public class TestString {
    public static void main(String[] args) {
        /** 字面量赋值创建字符串（如：String str=”twm”）时，
         * 会先在常量池中查找是否存在相同的字符串，若存在，则将栈中的引用直接指向该字符串；
         * 若不存在，则在常量池中生成一个字符串，再将栈中的引用指向该字符串。
         * */
        String s1 = "abc";
        String s2 = "abc";
        String ss = "ab"+"c";
        System.out.println(s1 == ss);/**字面量的 + 操作 在编译期间直接合并语句 等同于 ss = "abc" */
        System.out.println(s1 == s2);
        String s3 = new String("abc");
        System.out.println(s3 == s1);
        final String s = "c";
        System.out.println(s1 == ("ab" + s));/**对 final 变量的访问在编译期间都会直接被替代为真实的值。*/
        String s4 = "ab";
        String s5 = "c";
        final String s6 = "c";/**对 final 变量的访问在编译期间都会直接被替代为真实的值。*/
        String s7 = s4 + s5;
        System.out.println(s1 == s7);
        System.out.println((s1 == s7.intern())+"444444");
        System.out.println((s1.intern() == s7.intern())+"555555");/**.intern() 编译器会将字符串添加到常量池中*/
        String s8 = s4 + s6;//常量字符串和变量拼接时 调用stringBuilder.append()在堆上创建新的对象 虽然s6会在编译期间被替换成字面量"c",但是s4还是一个对象
        System.out.println(s1 == s8);
        String s9 = "ab" + s6;
        System.out.println(s1 == s9);
        String s10 = s4 + s6;
        System.out.println(s10 == s1);

    }
}
