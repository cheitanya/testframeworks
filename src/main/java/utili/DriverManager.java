package utili;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

/**
 * Created by shivalis on 11/20/16.
 */
public class DriverManager {

    public static WebDriver driver;

    public DriverManager()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/shivalis/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000");
    }
}
