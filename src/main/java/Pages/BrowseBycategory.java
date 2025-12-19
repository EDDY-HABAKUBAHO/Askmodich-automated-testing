package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BrowseBycategory {
    private WebDriver driver;
    private WebDriverWait wait;

    public BrowseBycategory(WebDriver driver){
        this.driver= driver;
        this.wait= new WebDriverWait(driver, 10);
    }


}
