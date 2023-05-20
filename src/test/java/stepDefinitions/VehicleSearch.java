package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VehicleSearch extends Base{
    WebDriver driver;

    @Given("I navigate to http://google.com")
    public void navigate(){
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void iSearchFor(String searchTerm) {
        driver.findElement(By.name("q")).sendKeys(searchTerm);
        driver.findElement(By.name("btnK")).click();
    }

    @Then("I verify number of search result is visible")
    public void iVerifyNumberOfSearchResultIsVisible() {
        boolean isDisplayed = driver.findElement(By.cssSelector("#result-stats")).isDisplayed();

        Assert.assertTrue(isDisplayed);


    }

    @And("I check public and private")
    public void iCheckPublicAndPrivate() {
    }

    @Then("I should see a text called \"You have selected : public and private")
    public void iShouldSeeATextCalledYouHaveSelectedPublicAndPrivate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
}
