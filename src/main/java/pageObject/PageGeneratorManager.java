package pageObject;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

    public static HomePageObject getHomePageObject(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static LoginPageObject getLoginPageObject(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static RegisterPageObject getRegisterPageObject(WebDriver driver) {
        return new RegisterPageObject(driver);
    }

    public static CommonPageObject getCommonPageObject(WebDriver driver){
        return new CommonPageObject(driver);
    }

    public static AddCustomerPageObject getAddCustomerPageObject(WebDriver driver){
        return new AddCustomerPageObject(driver);
    }
}
