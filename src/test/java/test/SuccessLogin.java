package test;

import java.util.concurrent.TimeUnit;

import Pages.Inbox;
import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;


public class SuccessLogin {

    WebDriver driver;
    Login objLogin;
    Inbox objInbox;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.yaanimail.com/login");
    }
    @Test(priority=0)
    public void test_Inbox_NewMail_show(){
        //Login ekranı için oluşturulan method'u çağırma
        objLogin = new Login(driver);
        //method'a username ve password bilgilerini iletme
        objLogin.LoginMethod("inanc.ozkul1", "Deneme11'");
        //login başarılıysa inbox method'unu çağırma
        objInbox = new Inbox(driver);
        //Yeni e-posta butonunu kontrol etme
        Assert.assertTrue(objInbox.getNewMailButton().toLowerCase().contains("yeni e-posta"));
    }
    @AfterTest
    public void close(){
        driver.close();
    }

}
