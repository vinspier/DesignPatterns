package com.fxb.patterns.decorator.example;

/**
 * 具有具体的装饰功能的类
 * 具体装饰者 1
 * */
public class SideBorder extends Border {
    private String borderChar;

    public SideBorder(Display display, String borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
