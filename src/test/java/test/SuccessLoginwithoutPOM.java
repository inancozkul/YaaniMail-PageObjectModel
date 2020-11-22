package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SuccessLoginwithoutPOM {

    @Test(priority=0)
    public void test_Inbox_NewMail_show(){
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.yaanimail.com/login");
        //Find user name and fill user name
        driver.findElement(By.xpath("//input[contains(@class,'robot_login_emailInput')]")).sendKeys("inanc.ozkul1");
        //find password and fill it
        driver.findElement(By.xpath("//input[contains(@class,'robot_login_password')]")).sendKeys("Deneme11'");
        //click login button
        driver.findElement(By.xpath("//button[contains(@class,'robot_login_signInButton')]")).click();
        String NewMail = driver.findElement(By.xpath("//span[text()='Yeni E-posta']")).getText();
        //verify login success
        Assert.assertTrue(NewMail.toLowerCase().contains("yeni e-posta"));
        driver.close();
    }
}
