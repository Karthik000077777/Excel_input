package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_Test_Orange_HRM extends  Calling_CreateDriver_By_atTheRateBefore_Test{
    Login_elements login_elements = new Login_elements();
    @Test
    public void verifyLogin(){
        login_elements.enterUserName("Admin");
        login_elements.enterPassword("admin123");
        login_elements.clickLogin();
    }
}
