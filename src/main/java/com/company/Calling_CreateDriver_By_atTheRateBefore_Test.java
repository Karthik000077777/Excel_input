package com.company;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Calling_CreateDriver_By_atTheRateBefore_Test {
    @BeforeTest
    public void call_create_driver(){
        Driver_Gen.createDriver();
    }
//
//    @AfterMethod
//    public void close_window(){
//        Driver_Gen.getDriver().quit();
//    }
}
