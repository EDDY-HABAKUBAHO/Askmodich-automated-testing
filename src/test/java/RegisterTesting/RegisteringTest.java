package RegisterTesting;

import BaseTests.BaseTest;
import Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisteringTest extends BaseTest {

    @Test
    public void registeringTesting(){
        RegisterPage registeringTesting=homepage.clickingregister();
        registeringTesting.setUsername("LeaveMetheFuckALone");
        registeringTesting.setEmail("umunigger@gmail.com");
        registeringTesting.setPassword("Eddy-2111");
        registeringTesting.clickingSignInButton();
        String helloText = registeringTesting.getHelloMessage();

        Assert.assertTrue(
                helloText.contains("Hello " + "LeaveMetheFuckALone"),
                "Hello message does not contain the username"
        );
    }
}
