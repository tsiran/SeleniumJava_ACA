package Page;

import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    BasePage basePage;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void goToHomePage() {
        basePage = new BasePage(driver);
        basePage.goToMenuItem("Home", "css",
                "[class='nav-link']");
    }

}
