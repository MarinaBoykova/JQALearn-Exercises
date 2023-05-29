package Homework9.pages;

import Homework9.helpers.generateRandomString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ConsultingPage extends generateRandomString {
    WebDriver driver;

    public ConsultingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locate page elements
    @FindBy(xpath = "//input[@data-original_id='name']")
    @CacheLookup
    WebElement userName;

    @FindBy(xpath = "//input[contains(@data-original_id,'email')]")
    @CacheLookup
    WebElement email;

    @FindBy(xpath = "//input[contains(@placeholder,'Company Name')]")
    @CacheLookup
    WebElement companyName;

    @FindBy(xpath = "//textarea[contains(@name,'et_pb_contact_message_0')]")
    @CacheLookup
    WebElement messageField;

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement sendMessageButton;

    @FindBy(xpath = "//h2[contains(@class,'title')]")
    @CacheLookup
    WebElement successfulMessage;

    // Method to check if successful message is displayed is present
    public void verifyIfSuccessfulMessageIsDisplayed() {
        String message = successfulMessage.getText();
        String expectedMessage = "We're Here To Transform Your Automation!";
        if (message.equalsIgnoreCase(expectedMessage))
            System.out.println("You sent a message!");

        else
            System.out.println("Something went wrong!");
    }

    // Method to populate the data and send the message
    public void sendMessage() {
        userName.sendKeys(generateRandomString());
        email.sendKeys(generateRandomString() + "@gmail.com");
        companyName.sendKeys(generateRandomString());
        messageField.sendKeys(generateRandomString());
        sendMessageButton.submit();
    }
}
