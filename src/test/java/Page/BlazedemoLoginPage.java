package Page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BlazedemoLoginPage {
    public BlazedemoLoginPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;

    public void login(String userName, String password){
        basePage  = new BasePage(driver);
        driver.get("https://www.demoblaze.com/");
        basePage.checkPageTitle("STORE");
        basePage.clickOnElement("id","login2");
    }
}
