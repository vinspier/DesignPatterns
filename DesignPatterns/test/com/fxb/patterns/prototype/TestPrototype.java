package com.fxb.patterns.prototype;

import com.fxb.patterns.prototype.example.Manager;
import com.fxb.patterns.prototype.example.MessageBox;
import com.fxb.patterns.prototype.example.UnderLine;

import java.util.ArrayList;

public class TestPrototype {
    public static void main(String[] args) {

        /** 创建一个注册中心 */
        Manager manager = new Manager();
        /********************************************************************************/
        /** 获取一个原型实例 作为样本 供后面通过注册中心复制使用 */
        MessageBox messageBox = new MessageBox("fxb");
        ArrayList<String> list =(ArrayList<String> ) messageBox.getList();
        list.add("123");list.add("456");list.add("789");
        messageBox.setList(list);

        manager.register("messageBox",messageBox);
        MessageBox messageBoxCopy = (MessageBox)manager.copy("messageBox");
        System.out.println("------------before change--------------");
        System.out.println(messageBox.getCharType() + "--------" + messageBoxCopy.getCharType() );
        System.out.println(messageBox.getArray()[6] +"--------" + messageBoxCopy.getArray()[6]);
        System.out.println(messageBox.getList().size() + "--------" + messageBoxCopy.getList().size());
        System.out.println("------------before change--------------");
        messageBoxCopy.setCharType("234567890");
        ArrayList<String> listCopy =(ArrayList<String> ) messageBoxCopy.getList();
        listCopy.add("000");
        messageBoxCopy.setList(listCopy);
        int[] array = messageBoxCopy.getArray();
        array[6] = 10;
        messageBoxCopy.setArray(array);
        //因为 在具体的原型类中重写了clone方法 所以原型实例与复制的实例互不影响
        System.out.println("------------after change--------------");
        System.out.println(messageBox.getCharType() + "--------" + messageBoxCopy.getCharType() );
        System.out.println(messageBox.getArray()[6] +"--------" + messageBoxCopy.getArray()[6]);
        System.out.println(messageBox.getList().size() + "--------" + messageBoxCopy.getList().size());
        System.out.println("------------after change--------------");
        /********************************************************************************/
        System.out.println("******************************************************************************/");
        UnderLine underLine = new UnderLine("original");
        underLine.setNo(10);
        manager.register("underLine",underLine);

        UnderLine underLineCopy = (UnderLine)manager.copy("underLine");
        System.out.println("------------before change--------------");
        System.out.println(underLine.getCharType() + "===================" + underLineCopy.getCharType());
        System.out.println(underLine.getNo() + "===================" + underLineCopy.getNo());
        System.out.println("------------before change--------------");
        int no = underLineCopy.getNo();
        no= 100;
        underLineCopy.setNo(no);
        String charType = underLineCopy.getCharType();
        charType = "changed";
        underLineCopy.setCharType(charType);
        System.out.println("------------after change--------------");
        System.out.println(underLine.getCharType() + "===================" + underLineCopy.getCharType());
        System.out.println(underLine.getNo() + "===================" + underLineCopy.getNo());
        System.out.println("------------after change--------------");


    }
}
