package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inbox {

    WebDriver driver;
    By button_NewEmail = By.xpath("//span[contains(@class,'compose-text')]");
    //@FindBy(xpath="//span[contains(@class,'compose-text')]")
    //WebElement button_NewEmail;

    public Inbox(WebDriver driver){
        this.driver = driver;
    }

    //Web elementler içerisinde yeni e-posta butonunun textinin alınması için eklenmiştir
    public String getNewMailButton(){
        return	driver.findElement(button_NewEmail).getText();
    }
}
