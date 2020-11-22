package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class Login {
    WebDriver driver;
    By userName = By.xpath("//input[contains(@class,'robot_login_emailInput')]");
    //@FindBy(xpath="//input[contains(@class,'robot_login_emailInput')]")
    //WebElement userName;

    By password = By.xpath("//input[contains(@class,'robot_login_password')]");
    //@FindBy(xpath="//input[contains(@class,'robot_login_password')]")
    //WebElement password;

    By login = By.xpath("//button[contains(@class,'robot_login_signInButton')]");
    //@FindBy(xpath="//button[contains(@class,'robot_login_signInButton')]")
    //WebElement login;

    public Login(WebDriver driver){
        this.driver = driver;
    }
    //Username input'una giriş yapma
    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);
    }

    //Password input'una giriş yapma
    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    //Giriş yap butonuna tıklama
    public void clickLogin(){
        driver.findElement(login).click();
    }

    public void LoginMethod(String strUserName,String strPasword){
        //test'ten gelen username'i doldur
        this.setUserName(strUserName);
        //test'ten gelen password'u doldur
        this.setPassword(strPasword);
        //girişlerden sonra login'e tıkla
        this.clickLogin();

    }
}
