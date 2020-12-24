package stepDefinitions;

import commons.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObject.PageGeneratorManager;
import pageObject.RegisterPageObject;

public class RegisterPageSteps {

    WebDriver driver;
    RegisterPageObject registerPage;
    DataHelper dataHelper;

    public RegisterPageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        registerPage = PageGeneratorManager.getRegisterPageObject(driver);
        dataHelper = DataHelper.getData();
    }


    @Given("^Input to email textbox$")
    public void inputToEmailTextbox() {
        registerPage.inputToEmailTextbox(dataHelper.getEmail());
    }

    @When("^Click to submit button$")
    public void clickToSubmitButton() {
        registerPage.clickToSubmitButton();
    }

    @When("^Get user and password info$")
    public void getUserAndPasswordInfo() {
        userID = registerPage.getUserID();
        password = registerPage.getPasswordValue();
    }

    @When("^Back to login page$")
    public void backToLoginPage() {
        registerPage.openLoginPage(LoginPageSteps.url);
    }

    public static String userID, password;
}
