import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Demo {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        // Go to https://demoqa.com/dynamic-properties
        // Verify "Color change" button is visible
        // Verify "Will enable 5 seconds" button is disabled
        // verify "will enable 5 seconds" button is enabled after 5 seconds
        // verify "Visible after 5 seconds" button is visible after 5 seconds

        System.out.println("User should be successfully logged in and logged out.");

        WebDriver driver;

        // Setup chrome browser
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();

        // Open a chrome browser
        driver = new ChromeDriver();
        // go to https://demoqa.com/dynamic-properties
        driver.get("https://demoqa.com/dynamic-properties");


        //color change button is visible
        boolean checkoutIconDisplayed = driver.findElement(By.cssSelector("#ColorChange")).isDisplayed();
        if (checkoutIconDisplayed) {
            System.out.println("button is displayed");
        } else {
            System.out.println("button is NOT displayed");

            //Verify "Will enable 5 seconds" button is disabled
            boolean WillEnablebutton = driver.findElement(By.cssSelector("#visibleAfter")).isDisplayed();
            if (WillEnablebutton) {
                System.out.println("will enable is visible");
            } else {
                System.out.println("will enable is disabled");

                // verify "will enable 5 seconds" button is enabled after 5 seconds
                WebDriverWait Wait = new WebDriverWait(driver, Duration.ofMillis(6000));
                Wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#enableAfter"))));

                // verify "will enable 5 seconds" button is enabled after 5 seconds
                FluentWait wait1 = new FluentWait(driver);
                wait1.withTimeout(Duration.ofMillis(6000));
                wait1.pollingEvery(Duration.ofMillis(5000));
                wait1.ignoring(NoSuchElementException.class);

                boolean visibleAfter = driver.findElement(By.cssSelector("#visibleAfter")).isDisplayed();
                if (WillEnablebutton) {
                    System.out.println("visible After button is visible");
                } else {
                    System.out.println("visible after button is disabled");



                }
            }
        }
    }
}

