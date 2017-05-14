package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page_objects.LoginPage;
import steps.LoginSteps;
import utili.DriverManager;

/**
 * Created by shivalis on 11/19/16.
 */
public class LoginTest {

    public static WebDriver driver;

    @BeforeSuite
    public void verifyBeforeSuite()
    {

        DriverManager manager = new DriverManager();
    }



    @Test
    public void verifyValidLogintoSpree()
    {
        LoginSteps loginSteps = new LoginSteps();
        String expected_message = loginSteps.Login("xt@xt.xom", "xtxtxt");
        Assert.assertEquals(expected_message, "MY ACCOUNT");
    }


    @Test
    public void verifyInvalidLogintoSpree()
    {
        LoginSteps loginSteps = new LoginSteps();
        String expected_message = loginSteps.InvalidLogin("xt@xt.com", "xtxtxt");
        Assert.assertEquals(expected_message, "Invalid email or password.");
    }
}
