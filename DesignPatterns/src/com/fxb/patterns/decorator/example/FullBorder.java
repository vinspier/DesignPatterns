package com.fxb.patterns.decorator.example;

/**
 * 具有具体的装饰功能的类
 * 具体装饰者 2
 * */
public class FullBorder extends Border {
    private String borderChar;

    public FullBorder(Display display, String borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0)
            return makeLine(borderChar,display.getColumns() + 2);//上边框
        else if (row == display.getRows() + 1)
            return makeLine(borderChar,display.getColumns() + 2);//下边框
        else
            return borderChar + display.getRowText(row - 1) + borderChar;//中间两侧边框
    }

    private String makeLine(String ch,int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++){
            sb.append(ch);
        }
        return sb.toString();
    }
}
