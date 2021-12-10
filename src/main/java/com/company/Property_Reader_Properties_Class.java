package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Reader_Properties_Class {
    static Properties prop = new Properties();
    public static void initProperty(){
        try {
            prop.load(new FileInputStream("C:\\Users\\karth\\IdeaProjects\\Method_driven_framework\\src\\main\\java\\com\\company\\Config.properties"));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return prop.getProperty(key);
    }
}
