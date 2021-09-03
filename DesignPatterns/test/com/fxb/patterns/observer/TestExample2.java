package com.fxb.patterns.observer;

import com.fxb.patterns.observer.example2.Police;
import com.fxb.patterns.observer.example2.Security;
import com.fxb.patterns.observer.example2.Thief;
import com.fxb.patterns.observer.example2.Transport;

public class TestExample2 {

    public static void main(String[] args) {

        Transport transport = new Transport();

        transport.registerWatcher(new Police());
        transport.registerWatcher(new Security());
        transport.registerWatcher(new Thief());

        transport.start();
    }

}
