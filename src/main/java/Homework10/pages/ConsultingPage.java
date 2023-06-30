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

    @FindBy(xpath = "//*[@id=\"et_pb_contact_form_0\"]/div/p")
    @CacheLookup
    WebElement successfulMessage;

    @FindBy(xpath = "//span[contains(@class,'et_pb_contact_captcha_question')]")
    @CacheLookup
    WebElement captcha;

    @FindBy(xpath = "//input[contains(@class,'input et_pb_contact_captcha')]")
    @CacheLookup
    WebElement captchaInput;

    @FindBy(xpath = "//li[contains(.,'Invalid email')]")
    @CacheLookup
    WebElement validationMessageForEmail;

    @FindBy(xpath = "//p[contains(.,'Please, fill in the following fields:')]")
    @CacheLookup
    WebElement validationMessageForMissingData;

    @FindBy(xpath = "//li[contains(.,'Name')]")
    @CacheLookup
    WebElement validationMessageForName;

    // Method to pass the captcha
    public void passCaptcha() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        this.captcha = wait.until(ExpectedConditions.visibilityOf(this.captcha));
        String str = this.captcha.getText();
        String firstText = str.substring(0, 2).replaceAll(" ", "");
        String secondString = str.substring(str.length() - 2).replaceAll(" ", "");
        int first = Integer.parseInt(firstText);
        int second = Integer.parseInt(secondString);
        int sum = first + second;
        String sum1 = Integer.toString(sum);
        this.captchaInput = wait.until(ExpectedConditions.elementToBeClickable(this.captchaInput));
        this.captchaInput.sendKeys(sum1);
    }

    // Method to check if page URL is correct
    public void verifyPageUrl() {
        String pageURL = this.driver.getCurrentUrl();
        String expectedPageURL = "https://ultimateqa.com/consulting/";
        if (pageURL.equals(expectedPageURL)) {
            System.out.println("The correct page is loaded!");

        } else {
            System.out.println("Wrong page!");
        }
    }

    // Method to populate the data
    public void populateData() {
        this.userName.sendKeys(generateRandomString());
        this.email.sendKeys(generateRandomString() + "@gmail.com");
        this.companyName.sendKeys(generateRandomString());
        this.messageField.sendKeys(generateRandomString());
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to populate the data with wrong email format
    public void populateDataWithWrongEmail() {
        this.userName.sendKeys(generateRandomString());
        this.email.sendKeys("99999999999");
        this.companyName.sendKeys(generateRandomString());
        this.messageField.sendKeys(generateRandomString());
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to populate the data without Name
    public void populateDataWithoutName() {
        this.email.sendKeys(generateRandomString() + "@gmail.com");
        this.companyName.sendKeys(generateRandomString());
        this.messageField.sendKeys(generateRandomString());
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to check if validation form email field is displayed
    public void verifyValidationForEmail() {
        // Wait until successfulMessage is visible
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        this.validationMessageForEmail = wait.until(ExpectedConditions.visibilityOf(this.validationMessageForEmail));
        String message = this.validationMessageForEmail.getText();
        String expectedMessage = "Invalid email";
        if (message.equals(expectedMessage))
            System.out.println("Invalid email!");

        else
            System.out.println("Something went wrong!");
    }

    // Method to check if validation form email field is displayed
    public void verifyValidationForName() {
        // Wait until successfulMessage is visible
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        this.validationMessageForMissingData = wait.until(ExpectedConditions.visibilityOf(this.validationMessageForMissingData));
        String message = this.validationMessageForMissingData.getText();
        String messageForField = this.validationMessageForName.getText();
        String expectedMessage = "Please, fill in the following fields:";
        if (message.contains(expectedMessage) && messageForField.contains("Name")) {
            System.out.println("Please, fill in the following fields: Name");

        } else {
            System.out.println("Something went wrong!");
        }
    }

    // Method to check if successful message is displayed
    public void verifyIfSuccessfulMessageIsDisplayed() {
        // Wait until successfulMessage is visible
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        this.successfulMessage = wait.until(ExpectedConditions.visibilityOf(this.successfulMessage));
        String message = this.successfulMessage.getText();
        String expectedMessage = "We have much appreciated the message and will contact you soon!";
        if (message.equals(expectedMessage))
            System.out.println("You sent a message!");

        else
            System.out.println("Something went wrong!");
    }

    public void clickOnSubmit() {
        this.sendMessageButton.submit();
    }
}
