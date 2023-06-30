package Homework10.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locate page elements
    @FindBy(xpath = "(//a[contains(.,'Professional Services')])[1]")
    @CacheLookup
    WebElement navigationLink;

    // Method to check if navigation link is present
    public void verifyLinkIsPresent() {
        // Wait until navigationLink is visible
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        this.navigationLink = wait.until(ExpectedConditions.visibilityOf(this.navigationLink));
        String linkName = this.navigationLink.getText();
        String expectedLinkName = "Professional Services";
        if (linkName.equals(expectedLinkName))
            System.out.println("The navigation link is present!");

        else
            System.out.println("The navigation link is not present!");
    }

    // Method to click on Navigation link
    public void clickOnLink() {
        this.navigationLink.click();
    }
}
