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
    public void verifyLinkIsPresent() {
        String linkName = navigationLink.getText();
        String expectedLinkName = "Professional Services";
        if (linkName.equals(expectedLinkName))
            System.out.println("The navigation link is present!");

        else
            System.out.println("The navigation link is not present!");
    }

    // Method to click on Navigation link
    public void clickOnLink() {
        navigationLink.click();
    }

}
