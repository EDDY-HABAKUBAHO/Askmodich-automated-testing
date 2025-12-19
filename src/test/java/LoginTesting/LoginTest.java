package LoginTesting;

import BaseTests.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
  public void loggingInTest(){
        LoginPage loggingInTest = homepage.clickloginPage();
        loggingInTest.setUsername("LeaveMetheFuckALone");
        loggingInTest.setPassword("Eddy-2111");
        loggingInTest.clickingSignInButton();
        String helloText = loggingInTest.getHelloMessage();

        Assert.assertTrue(
                helloText.contains("Hello " + "LeaveMetheFuckALone"),
                "Hello message does not contain the username"
        );
  }
}
