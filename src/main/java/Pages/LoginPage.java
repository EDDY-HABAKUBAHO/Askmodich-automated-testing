package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By Username= By.xpath("//*[@id=\"username\"]");
    private By Password= By.xpath("//*[@id=\"password\"]");
    private By LogginButton= By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button");
    private By helloMessage = By.xpath(
            "/html/body/div/div[1]/div/div/main/article/div/div[2]/div/div[2]/div/p[1]"
    );


    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);

    }
    public void setUsername(String UsernameWord){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Username));
        driver.findElement(Username).sendKeys(UsernameWord);
    }
    public void setPassword(String Password2){
        wait.until((ExpectedConditions.visibilityOfElementLocated(Password)));
        driver.findElement(Password).sendKeys(Password2);
    }
    public void clickingSignInButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogginButton));
        driver.findElement(LogginButton).click();
    }
    public String getHelloMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(helloMessage));
        return driver.findElement(helloMessage).getText();
    }
    }

