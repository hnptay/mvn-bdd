package pageObject;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUI.LoginPageUI;

public class LoginPageObject extends AbstractPage {
    private WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageUrl() {
        return getCurrentUrl(driver);
    }

    public void clickToHereLink() {
        waitForElementVisible(driver, LoginPageUI.HERE_LINK);
        clickToElement(driver, LoginPageUI.HERE_LINK);
    }

    public void inputUserID(String userID) {
        waitForElementVisible(driver, LoginPageUI.USER_TEXT_BOX);
        sendKeyToElement(driver, LoginPageUI.USER_TEXT_BOX, userID);
    }

    public void inputPassword(String password) {
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXT_BOX);
        sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXT_BOX, password);
    }

    public void clickToLoginButton() {
        waitForElementVisible(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    }
}
