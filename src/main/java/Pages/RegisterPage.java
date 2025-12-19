package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    private  WebDriver driver;
    private WebDriverWait wait;

    private By Username= By.xpath("//*[@id=\"reg_username\"]");
    private By Email= By.xpath("//*[@id=\"reg_email\"]");
    private By Password= By.xpath("//*[@id=\"reg_password\"]");
    private By RegisterButton= By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button");
    private By helloMessage = By.xpath(
            "/html/body/div/div[1]/div/div/main/article/div/div[2]/div/div[2]/div/p[1]"
    );

    public RegisterPage(WebDriver driver){
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
    public void setEmail(String YourEmail){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
        driver.findElement(Email).sendKeys(YourEmail);
    }
    public void clickingSignInButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RegisterButton));
        driver.findElement(RegisterButton).click();
    }
    public String getHelloMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(helloMessage));
        return driver.findElement(helloMessage).getText();
    }

}
