package com.fxb.patterns.decorator;

import com.fxb.patterns.decorator.example.Display;
import com.fxb.patterns.decorator.example.FullBorder;
import com.fxb.patterns.decorator.example.SideBorder;
import com.fxb.patterns.decorator.example.StringDisplay;

public class TestDecorator {
    public static void main(String[] args) {
        StringDisplay sd = new StringDisplay("fxb fxb fxb fxb");
        SideBorder sb = new SideBorder(sd,"-");
        FullBorder fb = new FullBorder(sd,"#");

        sd.show();
        System.out.println("");
        sb.show();
        System.out.println("");
        fb.show();
        System.out.println("");
        Display display = new SideBorder(
                            new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("fxb fxb") , "@"
                                        ) , "*"
                                ) , "#"
                            ),"+"
                         );
        display.show();
    }
}
