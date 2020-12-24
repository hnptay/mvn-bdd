package stepDefinitions;

import commons.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.CommonPageObject;
import pageObject.PageGeneratorManager;

public class CommonPageSteps {
    WebDriver driver;
    CommonPageObject commonPage;

    public CommonPageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        commonPage = PageGeneratorManager.getCommonPageObject(driver);
        DataHelper dataHelper = DataHelper.getData();
        randomEmail = dataHelper.getEmail();
    }

    @Given("^Open \"([^\"]*)\" page menu$")
    public void openPageMenu(String pageMenu) {
        commonPage.clickToDynamicMenuLink(pageMenu);
    }

    @When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
    public void inputToTextboxWithValue(String textBoxName, String value) {
        if(textBoxName.equals("E-mail")) value = randomEmail;
        else if(textBoxName.equals("Password")) value = RegisterPageSteps.password;
        commonPage.inputToDynamicTextBox(value, textBoxName);
    }

    @When("^Select Gender by select \"([^\"]*)\" radio button$")
    public void selectGenderBySelectRadioButton(String expectedGender) {
        commonPage.clickToDynamicRadioButton(expectedGender);
    }


    @When("^Input to \"([^\"]*)\" textarea with value \"([^\"]*)\"$")
    public void inputToTextareaWithValue(String textAreaName, String value) {
        commonPage.inputToDynamicTextarea(value, textAreaName);
    }

    @When("^Click to \"([^\"]*)\" button$")
    public void clickToButton(String buttonName) {
        commonPage.clickToDynamicButton(buttonName);
    }

    @Then("^Verify success message \"([^\"]*)\" displayed$")
    public void verifySuccessMessageDisplayed(String expectedMessage) {
        Assert.assertTrue(commonPage.isInfoMessageDisplayed(expectedMessage));
    }

    @Then("^The valid value displayed at \"([^\"]*)\" with \"([^\"]*)\"$")
    public void theValidValueDisplayedAtWith(String rowName, String value) {
        if(rowName.equals("Email")) value = randomEmail;
        Assert.assertEquals(value, commonPage.getDynamicColumnValue(rowName));
    }

    @Then("Get \"([^\"]*)\" in the textbox")
    public void getCustomerID(String textBoxName){
        customerID = commonPage.getDynamicColumnValue(textBoxName);
    }

    public static String customerID, randomEmail;
}
