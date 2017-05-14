package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by shivalis on 11/19/16.
 */
public class LoginPage {


    WebDriver driver;

    @FindBy(how = How.ID, using = "spree_user_email")
    WebElement user;

    @FindBy(how = How.ID, using = "spree_user_password")
    WebElement password;

    @FindBy(how = How.NAME, using = "commit")
    WebElement submit;

    @FindBy(how = How.XPATH, using = "//*[@id='content']/div[1]")
    WebElement invalidEmail;

    public void enterUsername(String userName)
    {
        user.sendKeys(userName);
    }


    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }


    public void clickSubmit() {
        submit.click();
    }

    public String getInvalidLoginText() {
        return invalidEmail.getText();
    }


}
