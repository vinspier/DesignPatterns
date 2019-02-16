package com.fxb.patterns.decorator.example;

/**
 *
 * 具体被装饰者类
 * */
public class StringDisplay extends Display {
    private String content;

    public StringDisplay(String content) {
        this.content = content;
    }

    @Override
    public int getColumns() {
        return content.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0)  // 例子只有一行
            return content;
        else
            return null;
    }
}
