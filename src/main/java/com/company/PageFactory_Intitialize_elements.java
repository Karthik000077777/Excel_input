package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactory_Intitialize_elements {
    WebDriver driver;
    public PageFactory_Intitialize_elements() {
        driver = MDF.getDriver();
        PageFactory.initElements(driver,this);
    }
}
