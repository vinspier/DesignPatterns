package com.fxb.patterns.abstractFactory.example1.product;

public class Component_A1 extends Component {
    public static final String  nm = "ADFD15635613431";
    private String number;
    public Component_A1() {
        this.number = nm;
        System.out.println("组装零件A1  "+this.number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
