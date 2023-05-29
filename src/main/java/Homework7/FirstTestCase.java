package Homework7;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase extends generateRandomString {

    public static void main(String[] args) throws InterruptedException {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch website
        driver.navigate().to("https://ultimateqa.com/");
        driver.manage().window().maximize();

        // Click one navigation link and verify the page url
        WebElement navigationLink = driver.findElement(By.xpath("(//a[contains(.,'Professional Services')])[1]"));
        navigationLink.click();
        Assert.assertEquals("https://ultimateqa.com/consulting/", driver.getCurrentUrl());

        // Locate page elements, Verify all elements are displayed
        // Populate the data and click Send Message button
        WebElement userName = driver.findElement(By.xpath("//input[@data-original_id='name']"));
        Assert.assertTrue(userName.isDisplayed());
        userName.sendKeys(generateRandomString());

        WebElement email = driver.findElement(By.xpath("//input[contains(@data-original_id,'email')]"));
        Assert.assertTrue(email.isDisplayed());
        email.sendKeys(generateRandomString() + "@gmail.com");

        WebElement companyName = driver.findElement(By.xpath("//input[contains(@placeholder,'Company Name')]"));
        Assert.assertTrue(companyName.isDisplayed());
        companyName.sendKeys(generateRandomString());

        WebElement message = driver.findElement(By.xpath("//textarea[contains(@name,'et_pb_contact_message_0')]"));
        Assert.assertTrue(message.isDisplayed());
        message.sendKeys(generateRandomString());

        WebElement sendMessageButton = driver.findElement(By.xpath("//button[@type='submit']"));
        Assert.assertTrue(sendMessageButton.isDisplayed());
        sendMessageButton.click();

        // Close the opened browser(s)
        driver.quit();
    }
}