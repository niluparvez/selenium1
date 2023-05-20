package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class DemoQA_Checkboxes extends Base{
    @When("I expand all checkboxes")
    public void iExpandAllCheckboxes() {
        // #tree-node > div > button.rct-option.rct-option-expand-all
        // .rct-option-expand-all
        // .rct-options button.rct-option-expand-all

        driver.findElement(By.cssSelector(".rct-option-expand-all")).click();

    }

    @And("I check public and private")
    public void iCheckPublicAndPrivate() {
        // #tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label
        // label[for='tree-node-public']

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(483, 625)", "");

        driver.findElement(By.cssSelector("label[for='tree-node-public']")).click();

        // #tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label
        driver.findElement(By.cssSelector("label[for='tree-node-private']")).click();

    }

    @Then("I should see a text called {string}")
    public void iShouldSeeATextCalled(String expectedText) {
        // #result
        String actualText = driver.findElement(By.cssSelector("#result")).getText();
        assert actualText.contains(expectedText);
    }
}
