package Test;

import Base.SeleniumBase;
import Page.LoginPage;
import Utils.Helpers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlazedemoLoginTest extends SeleniumBase {

    LoginPage blazedemoLoginPage;
    Helpers helpers = new Helpers();

    @BeforeClass
    public void setupDriver() {
        InitDriver();
    }

    @AfterClass
    public void tearDown() {
        quitDriver();
    }

    @Test
    public void BlazeDemoTest() {
        blazedemoLoginPage = new LoginPage(driver);
        String login = helpers.randomStr(6);
        String password = helpers.randomStr(6);
        blazedemoLoginPage.login(login, password);
    }

}
