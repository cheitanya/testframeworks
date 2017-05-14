package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by shivalis on 11/20/16.
 */
public class HomePage {
    @FindBy(how= How.LINK_TEXT, using = "MY ACCOUNT")
    WebElement my_account;

    @FindBy(how= How.ID, using = "link-to-login")
    WebElement login_link;

    @FindBy(how= How.LINK_TEXT, using = "LOGOUT")
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
