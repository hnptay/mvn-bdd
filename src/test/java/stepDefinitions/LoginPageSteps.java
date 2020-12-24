package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObject.LoginPageObject;
import pageObject.PageGeneratorManager;

public class LoginPageSteps {

    WebDriver driver;
    LoginPageObject loginPage;
    public LoginPageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        loginPage = PageGeneratorManager.getLoginPageObject(driver);
    }

    @Given("^Open register page$")
    public void openRegisterPage() {
        loginPage.clickToHereLink();
    }

    @Given("^Get login page url$")
    public void getLoginPageUrl() {
        url = loginPage.getLoginPageUrl();
    }

    @Then("^Login to system$")
    public void loginToSystem() {
        loginPage.inputUserID(RegisterPageSteps.userID);
        loginPage.inputPassword(RegisterPageSteps.password);
        loginPage.clickToLoginButton();
    }

    public static String url;
}
