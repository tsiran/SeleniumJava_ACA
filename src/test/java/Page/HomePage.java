package Page;

import org.openqa.selenium.WebDriver;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;

    public void goToHomePage() {
        basePage.goToMenuItem("Home", "css",
                "[class='nav-link']");
    }

}
