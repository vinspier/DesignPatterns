package com.fxb.patterns.facade.example;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * 需要被窗口调用的底层复杂关系类
 * */
public class PropertyUtil {

    private PropertyUtil() {
    }

    /** 获取指定文件名的常量 */
    public static Properties getProperties(String filename){
        String file = filename + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
