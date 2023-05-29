package Homework10.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

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
    public String verifyLinkIsPresent() {
        String linkName = navigationLink.getText();
        return linkName;
    }

    // Method to click on Navigation link
    public void clickOnLink() {
        navigationLink.click();
    }

}
