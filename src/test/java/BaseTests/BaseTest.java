package BaseTests;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://askomdch.com/");

        homepage = new HomePage(driver);

    }
    @AfterClass
    public void endTesting() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }
}
