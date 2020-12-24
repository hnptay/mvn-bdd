package pageObject;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUI.CommonPageUI;

public class AddCustomerPageObject extends AbstractPage {

    public AddCustomerPageObject(WebDriver driver){
        this.driver = driver;
    }

    public void sendKeyToDOB(String value, String values){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX,values);
        removeAttributeInDOM(driver,CommonPageUI.DYNAMIC_TEXTBOX, "type", values);
        sendKeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX, value, values);
    }


    WebDriver driver;
}
