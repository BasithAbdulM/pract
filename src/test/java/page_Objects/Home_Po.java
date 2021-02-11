package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class Home_Po {
    WebDriver driver;
    public Home_Po( WebDriver driver){
        this.driver=driver;
    }
    public  void Home_Task(){
        WebElement Acc= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Acc.click();
    }
}
