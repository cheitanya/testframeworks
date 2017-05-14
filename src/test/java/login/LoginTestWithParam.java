package login;

import org.testng.Assert;
import org.testng.annotations.*;
import steps.LoginSteps;
import utili.DriverManager;

/**
 * Created by shivalis on 11/20/16.
 */
public class LoginTestWithParam {


    @BeforeSuite
    public void verifyBeforeSuite()
    {
        DriverManager manager = new DriverManager();
    }

    @DataProvider(name = "login")
    public static Object[][] loginData() {

        return new Object[][]
                {{"xt@xt.xom", "xtxtxt"}, {"abc@xt.xom", "xtxtxt"}};
    }


    @Test
    @Parameters({"userName", "password"})
    public void verifyValidLogIntoSpree(String userName, String password)
    {
        LoginSteps loginSteps = new LoginSteps();
        String expected_message = loginSteps.Login(userName, password);
        Assert.assertEquals(expected_message, "MY ACCOUNT");

    }

    @Test (dataProvider = "login")
    public void verifyValidLogIntoSpreeWithDataProvider(String userName, String password)
    {
        LoginSteps loginSteps = new LoginSteps();
        String expected_message = loginSteps.Login(userName, password);
        Assert.assertEquals(expected_message, "MY ACCOUNT");
    }

   @AfterMethod
   public void logout()
   {
       LoginSteps loginSteps = new LoginSteps();
       loginSteps.logOut();
   }
}
