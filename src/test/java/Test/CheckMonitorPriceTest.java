package Test;

import Base.SeleniumBase;
import Page.BasePage;
import Page.HomePage;
import Page.MonitordPage;
import Page.SignUpPage;
import Utils.Helpers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckMonitorPriceTest extends SeleniumBase {

    BasePage basePage;
    SignUpPage signUpPage;
    HomePage homePage;
    MonitordPage monitordPage;
    Helpers helpers;

    private String username;
    private String password;

    @BeforeClass
    public void monitorTestPrerequisites() throws InterruptedException {
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
        monitordPage = new MonitordPage(driver);
        monitordPage.checkMonitorPrice("$230");
    }
}
