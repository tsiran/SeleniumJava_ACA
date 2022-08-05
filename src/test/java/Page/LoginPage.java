package Page;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;

    public void login(String userName, String password){
        basePage  = new BasePage(driver);
        basePage.checkPageTitle("STORE");
        basePage.clickOnElement("id","login2");
        basePage.insertInto("id", "loginusername", userName);
        basePage.insertInto("id", "loginpassword", password);
        basePage.clickOnElement("css", "[onclick='logIn()']");
        basePage.checkElemetText("id", "nameofuser", "Welcome " + userName);
    }
}
