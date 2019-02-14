package com.fxb.patterns.bridge;

import com.fxb.patterns.bridge.example.Display;
import com.fxb.patterns.bridge.example.NumberDisplayImpl;
import com.fxb.patterns.bridge.example.StringDisplayImpl;

public class TestBridge{
    public static void main(String[] args) throws Exception{
        Display sDisplay = new Display(new StringDisplayImpl("Life is difficult, we must keep going !"));
        Display nDisplay = new Display(new NumberDisplayImpl(50));

        sDisplay.display();
        System.out.println();
        nDisplay.display();
    }

}
