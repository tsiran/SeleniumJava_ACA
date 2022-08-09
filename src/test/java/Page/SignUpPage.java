package Page;

import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;
    BasePage basePage;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registration(String username, String password) throws InterruptedException {
        basePage = new BasePage(driver);
        basePage.clickOnElement("id", "signin2");
        basePage.insertInto("id", "sign-username", username);
        basePage.insertInto("id", "sign-password", password);
        basePage.clickOnElement("css", "[onclick='register()']");
        basePage.checkAlertMessage("Sign up successful.");
        basePage.alertAccept();
    }

}
