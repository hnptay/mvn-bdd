package pageObject;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUI.RegisterPageUI;

public class RegisterPageObject extends AbstractPage {
    private WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToEmailTextbox(String email) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXT_BOX);
        sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXT_BOX, email);
    }

    public void clickToSubmitButton() {
        waitForElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
        clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
    }

    public String getUserID() {
        waitForElementVisible(driver, RegisterPageUI.USER_TEXT);
        return getElementText(driver, RegisterPageUI.USER_TEXT);
    }

    public String getPasswordValue() {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXT);
        return getElementText(driver, RegisterPageUI.PASSWORD_TEXT);
    }

    public void openLoginPage(String loginPageUrl) {
        openUrl(driver, loginPageUrl);
    }
}
