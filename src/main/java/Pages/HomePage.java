package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }
    public void clickLink(String path){
        By linkPath = By.xpath(path);
        wait.until(ExpectedConditions.presenceOfElementLocated(linkPath));
        WebElement element = driver.findElement(linkPath);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(linkPath));
        try {
            element.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }

    }
    public RegisterPage clickingregister(){
        clickLink("//*[@id=\"menu-item-1237\"]/a");
        return new RegisterPage(driver);
    }
    public LoginPage clickloginPage(){
        clickLink("//*[@id=\"menu-item-1237\"]/a");
        return new LoginPage(driver);
    }
    public BrowseBycategory clickOnShopNow(){
        clickLink("//*[@id=\"post-61\"]/div/div[2]/div/div/div[1]/div/div/div/div/a");
        return new BrowseBycategory(driver);
    }
    public ProductDetails clickOnProduct(){
        clickLink("//*[@id=\"tbodyid\"]/div[1]/div/a/img");
        return new ProductDetails(driver);
    }



}
