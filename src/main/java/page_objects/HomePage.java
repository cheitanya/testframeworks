package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;



/**
 * Created by shivalis on 11/20/16.
 */
public class HomePage {



    @FindBy(linkText= "MY ACCOUNT")
    WebElement my_account;

    @FindBy(id="")
    WebElement login_link;

    @FindBy(linkText = "LOGOUT")
    WebElement logout;


    public void clickOnLoginLink()
    {
        login_link.click();
    }

    public String getMyAccountText()
    {
        return  my_account.getText();
    }

    public void clickLogOut() {
        logout.click();
    }

}
