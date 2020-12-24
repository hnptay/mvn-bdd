package pageObject;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUI.HomePageUI;

public class HomePageObject extends AbstractPage {
    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isWelcomeMessageDisplayed() {
        return isElementDisplay(driver, HomePageUI.WELCOME_MESSAGE);
    }
}
