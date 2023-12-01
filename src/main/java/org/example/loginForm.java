package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class loginForm {

    private WebDriver driver;


    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rashad\\IdeaProjects\\untitled5\\geckodriver.exe");

        // Initialize the WebDriver
        driver = new FirefoxDriver();

        // Set implicit wait to handle dynamic elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("User is on the login page");
        driver.get("https://github.com/login");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        WebElement username = driver.findElement(By.cssSelector("#login_field"));
        username.sendKeys("rashad2001");
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("12345678");
        System.out.println("User enters username and password");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.cssSelector("input.btn"));
        loginButton.click();
        System.out.println("User clicks on login button");
    }

    @Then("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {

        assertTrue(driver.getCurrentUrl().startsWith("https://github.com/"));
        // Code to verify navigation to the homepage
        System.out.println("User is navigated to the homepage");
    }
}