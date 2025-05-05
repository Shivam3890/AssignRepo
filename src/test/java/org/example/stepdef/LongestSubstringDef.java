package org.example.stepdef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LongestSubstringDef {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new WebDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("I am on the Input page of the application")
    public void i_am_on_the_input_page_of_the_application() {
        driver.get("http://yourapplication.com/input");
    }

    @Given("I have entered a string {string} having repeated characters")
    public void i_have_entered_a_string_having_repeated_characters(String input) {
        driver.findElement(By.id("inputField")).sendKeys(input);
    }

    @When("I click on Submit button")
    public void i_click_on_submit_button() {
        driver.findElement(By.id("submitButton")).click();
    }

    @Then("I should be able to view correct output")
    public void i_should_be_able_to_view_correct_output() {
        String expectedLength = driver.findElement(By.id("outputLength")).getText();
        Assert.assertEquals(expectedLength, "3"); // Adjust the expected value as per your test case
    }
}
