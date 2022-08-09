package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MonitordPage {

   WebDriver driver;
   BasePage basePage;

    public MonitordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkMonitorPrice(String price){
        basePage = new BasePage(driver);
        basePage.goToMenuItem("Monitors", "id", "itemc");
        basePage.goToMenuItem("ASUS Full HD", "css", ".card-title");
        basePage.verifyMenuItemText( price, "css", ".price-container");
    }
}
