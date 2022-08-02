package Test;

import Base.SeleniumBase;
import Page.BlazedemoLoginPage;
import Utils.Helpers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlazedemoLoginTest extends SeleniumBase {

    BlazedemoLoginPage blazedemoLoginPage;
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
        blazedemoLoginPage = new BlazedemoLoginPage(driver);
        String login = helpers.randomStr(6);
        String password = helpers.randomStr(6);
        blazedemoLoginPage.login(login, password);
    }

}
