package reference;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FacebookSteps {
    WebDriver driver;

    @Before("@FacebookTest")
    public void openFacebookApplication()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void quitBrowser(){
        driver.quit();
    }

    @Then("^Verify email textbox is displayed$")
    public void verifyEmailTextboxIsDisplayed()  {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
    }
    @When("^Input to UserID \"([^\"]*)\"$")
    public void iInputToUserID(String userName) {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
    }

    @When("^Input to Password \"([^\"]*)\"$")
    public void iInputToPassword(String password) {
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
    }


    @Then("^Verify password textbox is displayed$")
    public void verifyPasswordTextboxIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed());
    }

    @When("^Input to UserID \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void iInputToUserIDAbdPassword(String userName, String password) {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
    }

    @When("^Input to UserID and Password$")
    public void inputToUserIDAndPassword(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get(0).get("UserID"));
        driver.findElement(By.xpath("//input[@id='pass']")).clear();
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(data.get(0).get("Password"));
    }

    @When("^Input to multiple UserID and Password$")
    public void inputToMultipleUserIDAndPassword(DataTable dataTable) {
        for(Map<String, String> data: dataTable.asMaps(String.class, String.class)){
            driver.findElement(By.xpath("//input[@id='email']")).clear();
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get("UserID"));
            driver.findElement(By.xpath("//input[@id='pass']")).clear();
            driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(data.get("Password"));
        }
    }

}
