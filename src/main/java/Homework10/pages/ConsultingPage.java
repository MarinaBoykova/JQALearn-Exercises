package Homework10.pages;

import Homework10.helpers.generateRandomString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    @FindBy(xpath = "//*[@id=\"et_pb_contact_form_0\"]/div")
    @CacheLookup
    WebElement successfulMessage;

    @FindBy(xpath = "//span[contains(@class,'et_pb_contact_captcha_question')]")
    @CacheLookup
    WebElement captcha;

    @FindBy(xpath = "//input[contains(@class,'input et_pb_contact_captcha')]")
    @CacheLookup
    WebElement captchaInput;

    // Method to pass the captcha
    public void passCaptcha() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        captcha = wait.until(ExpectedConditions.visibilityOf(captcha));
        String str = captcha.getText();
        System.out.println(str);
        String firstText = str.substring(0, 1).replaceAll(" ", "");
        String secondString = str.substring(str.length() - 2).replaceAll(" ", "");
        int first = Integer.parseInt(firstText);
        int second = Integer.parseInt(secondString);
        int sum = first + second;
        String sum1 = Integer.toString(sum);
        captchaInput = wait.until(ExpectedConditions.elementToBeClickable(captchaInput));
        captchaInput.sendKeys(sum1);
    }

    // Method to check if page URL is correct
    public void verifyPageUrl() {
        String pageURL = driver.getCurrentUrl();
        String expectedPageURL = "https://ultimateqa.com/consulting/";
        if (pageURL.equals(expectedPageURL))
            System.out.println("The correct page is loaded!");

        else
            System.out.println("Wrong page!");
    }

    // Method to populate the data and send the message
    public void populateData() {
        userName.sendKeys(generateRandomString());
        email.sendKeys(generateRandomString() + "@gmail.com");
        companyName.sendKeys(generateRandomString());
        messageField.sendKeys(generateRandomString());
    }

    // Method to check if successful message is displayed is present
    public void verifyIfSuccessfulMessageIsDisplayed() {
        // Wait until successfulMessage is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        successfulMessage = wait.until(ExpectedConditions.visibilityOf(successfulMessage));
        String message = successfulMessage.getText();
        String expectedMessage = "We have much appreciated the message and will contact you soon!";
        if (message.equals(expectedMessage))
            System.out.println("You sent a message!");

        else
            System.out.println("Something went wrong!");
    }

    public void clickOnSubmit() {
        sendMessageButton.submit();
    }
}
