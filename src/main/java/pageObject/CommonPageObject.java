package pageObject;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUI.CommonPageUI;

public class CommonPageObject extends AbstractPage {
    WebDriver driver;

    public CommonPageObject(WebDriver driver){
        this.driver = driver;
    }

    public void inputToDynamicTextBox(String value, String...values){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX, values);
        sendKeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX, value, values);
    }

    public void inputToDynamicTextarea(String value, String...values){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTAREA, values);
        sendKeyToElement(driver, CommonPageUI.DYNAMIC_TEXTAREA, value, values);
    }

    public void clickToDynamicRadioButton(String...values){
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_RADIO_BUTTON, values);
        clickToElement(driver, CommonPageUI.DYNAMIC_RADIO_BUTTON, values);
    }

    public void clickToDynamicButton(String...values){
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON, values);
        clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON, values);
    }

    public void clickToDynamicMenuLink(String...values){
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_MENU_LINK, values);
        clickToElement(driver, CommonPageUI.DYNAMIC_MENU_LINK, values);
    }

    public boolean isInfoMessageDisplayed(String...values){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_MESSAGE, values);
        return isElementDisplay(driver, CommonPageUI.DYNAMIC_MESSAGE, values);
    }

    public String getDynamicColumnValue(String...values){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_VALUE_COLUMNNAME, values);
        return getElementText(driver, CommonPageUI.DYNAMIC_VALUE_COLUMNNAME, values);
    }

}
