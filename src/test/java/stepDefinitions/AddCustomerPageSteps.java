package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObject.AddCustomerPageObject;
import pageObject.PageGeneratorManager;

public class AddCustomerPageSteps {
    WebDriver driver;
    AddCustomerPageObject addCustomerPage;

    public AddCustomerPageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        addCustomerPage = PageGeneratorManager.getAddCustomerPageObject(driver);
    }

    @When("^Select \"([^\"]*)\" with value \"([^\"]*)\"$")
    public void selectDateOfBirthWithValue(String textBoxName, String value) {
        addCustomerPage.sendKeyToDOB(value, textBoxName);
    }

}
