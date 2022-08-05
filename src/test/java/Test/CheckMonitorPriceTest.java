package Test;

import Page.BasePage;
import Page.HomePage;
import Page.SignUpPage;
import Utils.Helpers;
import org.apache.commons.lang3.time.CalendarUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckMonitorPriceTest {

    public CheckMonitorPriceTest(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;
    SignUpPage signUpPage;
    HomePage homePage;
    Helpers helpers;

    private String username;
    private String password;

    @BeforeClass
    public void monitorTestPrerequisites() {
        basePage = new BasePage(driver);
        signUpPage = new SignUpPage(driver);
        homePage = new HomePage(driver);
        helpers = new Helpers();
        String rndStr = helpers.randomStr(5);
        username = rndStr;
        password = rndStr;
        basePage.getUrl("https://www.demoblaze.com/");
        signUpPage.registration(username, password);
        homePage.goToHomePage();

    }

    @Test
    public void testCheckMonitorPrice(){

    }

    @AfterClass
    public void monitorTestPostRequisites(){

    }
}
