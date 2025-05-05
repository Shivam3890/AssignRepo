package org.example.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Substring {

        private WebDriver driver;

        // Locators
        private By InputString = By.id("ababbccb");
        private By submitButtonLocator = By.xpath("//input[@type='submit']");


        // Constructor
        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        // Methods
        public void enterInputString(String str) {
            WebElement Input = driver.findElement(InputString);
            Input.sendKeys(email);
        }

        public void clickSubmitButton() {
            WebElement submitButton = driver.findElement(submitButtonLocator);
            submitButton.click();
        }

    }
}
