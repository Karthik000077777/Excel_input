package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver_Gen {
    static WebDriver driver;
    public static void createDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\IdeaProjects\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static WebDriver getDriver(){
        return driver;
    }

}
