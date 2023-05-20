import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homework{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        //setup chrome browser
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();

        //open a chrome browser
        driver = new ChromeDriver();

        //navigate to the URL https://www.saucedemo.com/
        driver.get("https://www.saucedemo.com/");

        //Enter standard_user in the username field
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

        //Enter secret_sauce in the password field
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

        //click on login button
        driver.findElement(By.cssSelector("#login-button")).click();

       //click add to cart button
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();

        //click to cart icon
        driver.findElement(By.cssSelector("#shopping_cart_container")).click();

        //click to checkout button
        driver.findElement(By.cssSelector("#checkout")).click();

        //fill out checkout information
        driver.findElement(By.cssSelector("#first-name")).sendKeys("narmila");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("nilu");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("11208");

        //click to continue button
        driver.findElement(By.cssSelector("#continue")).click();

        //click to finish button
        driver.findElement(By.cssSelector("#finish")).click();



    }

}

