package Homework10.tests;

import Homework10.helpers.BrowserFactory;
import Homework10.pages.ConsultingPage;
import Homework10.pages.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyMessageSending {

    @Test
    public void checkMessageSending() {

        // Launch the browser
        WebDriver driver = BrowserFactory.startBrowser("chrome", "https://ultimateqa.com/consulting/");

        // Created Page Objects using Page Factory
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ConsultingPage consultingPage = PageFactory.initElements(driver, ConsultingPage.class);

        // Call the methods
        homePage.verifyLinkIsPresent();
        homePage.clickOnLink();
        consultingPage.sendMessage();
        consultingPage.verifyIfSuccessfulMessageIsDisplayed();
    }

    @After
    public void tearDown() {
        BrowserFactory.closeBrowser();
    }

}
