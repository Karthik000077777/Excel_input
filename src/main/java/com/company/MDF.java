package com.company;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MDF {
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
class PageFactory_Intitialize_elements11 {
    WebDriver driver;
    public PageFactory_Intitialize_elements11() {
        driver = MDF.getDriver();
        PageFactory.initElements(driver,this);
    }
}
class Login_elements11 extends PageFactory_Intitialize_elements11 {
    // Finding Elements : Declaration
    @FindBy(id="txtUsername")
    private WebElement unTB;
    @FindBy(id="txtPassword")
    private WebElement pwTB;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement btnLogin;
    @FindBy(xpath = "//b[text()='Admin']")
    private WebElement navAdmin;
    @FindBy(id = "menu_admin_UserManagement")
    private WebElement um;
    @FindBy(id = "menu_admin_viewSystemUsers")
    private WebElement users;
    @FindBy(xpath = "//input[@id='btnAdd']")
    private WebElement add;
    @FindBy(xpath = "//*[@id='systemUser_userType']")
    private WebElement userRoleSelect;
    @FindBy(xpath = "//*[@id='systemUser_employeeName_empName']")
    private WebElement ename;
    @FindBy(xpath = "//*[@id='systemUser_userName']")
    private WebElement uname;
    @FindBy(xpath = "//*[@id='systemUser_status']")
    private WebElement statusSelect;
    @FindBy(xpath = "//*[@id='systemUser_password']")
    private WebElement password;
    @FindBy(xpath = "//*[@id='systemUser_confirmPassword']")
    private WebElement cnfPassword;
    @FindBy(xpath = "//input[@class='addbutton']")
    private WebElement btnSave;
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
    public void Action11(){
        Actions at=new Actions(driver);
        at.moveToElement(navAdmin).perform();
        at.moveToElement(um).perform();
        users.click();
    }
    public void addUser() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\IdeaProjects\\Automation\\chromedriver.exe");
        add.click();
        Select slt = new Select(userRoleSelect);
        slt.selectByIndex(0);
        ename.sendKeys(com.company.Property_Reader_Properties_Class.getProperty("add.ename"));
        uname.sendKeys(com.company.Property_Reader_Properties_Class.getProperty("add.uname"));
        Select slt1 = new Select(statusSelect);
        slt1.selectByIndex(0);
        password.sendKeys(com.company.Property_Reader_Properties_Class.getProperty("add.pwd"));
        cnfPassword.sendKeys(com.company.Property_Reader_Properties_Class.getProperty("add.cnfpwd"));
        Thread.sleep(3000);
        btnSave.click();
    }
}
class Calling_CreateDriver_By_atTheRateBefore_Test11 {
    @BeforeTest
    public void call_create_driver() {
        MDF.createDriver();
    }
}
class Login_Test_Orange_HRM11 extends  Calling_CreateDriver_By_atTheRateBefore_Test11{
    @Test(priority = 0)
    public void verifyLoginAndAddUser() throws InterruptedException {
        Login_elements11 login_elements = new Login_elements11();
        com.company.Property_Reader_Properties_Class.initProperty();
        login_elements.enterUserName(com.company.Property_Reader_Properties_Class.getProperty("login.username"));
        login_elements.enterPassword(com.company.Property_Reader_Properties_Class.getProperty("login.password"));
        login_elements.clickLogin();
        login_elements.Action11();
        login_elements.addUser();
    }
}