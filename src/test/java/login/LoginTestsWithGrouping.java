package login;

import org.testng.annotations.Test;

/**
 * Created by shivalis on 11/19/16.
 */
public class LoginTestsWithGrouping {

    @Test(groups = {"smoke"}, priority = 2)
    public void verifyValidLogintoSpree()
    {
        System.out.println("second");
    }


    @Test (groups = {"smoke", "regression"}, priority = 1)
    public void verifyInvalidLogintoSpree()
    {
        System.out.println("first");
    }

}
