package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_elements extends PageFactory_Intitialize_elements {
    // Finding Elements : Declaration
    @FindBy(id="txtUsername")
    private WebElement unTB;
    @FindBy(id="txtPassword")
    private WebElement pwTB;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement btnLogin;
    // Calling Methods : Utilisation
    public void enterUserName(String un){
        unTB.sendKeys(un);
    }
    public void enterPassword(String pw){
        pwTB.sendKeys(pw);
    }
    public void clickLogin(){
        btnLogin.click();
    }
}
