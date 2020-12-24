package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.HomePageObject;
import pageObject.PageGeneratorManager;

public class HomePageSteps {

    WebDriver driver;
    HomePageObject homePage;

    public HomePageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        homePage = PageGeneratorManager.getHomePageObject(driver);
    }

    @Then("^Verify login success$")
    public void verifyLoginSuccess() {
        Assert.assertTrue(homePage.isWelcomeMessageDisplayed());
    }
}
