package Homework10.tests;

import Homework10.helpers.BrowserFactory;
import Homework10.pages.ConsultingPage;
import Homework10.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyMessageSending {

    @Test
    public void verifyMessageSending() {

        // Launch the browser
        WebDriver driver = BrowserFactory.startBrowser("chrome", "https://ultimateqa.com/");

        // Created Page Objects using Page Factory
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ConsultingPage consultingPage = PageFactory.initElements(driver, ConsultingPage.class);

        // Call the methods
        homePage.verifyLinkIsPresent();
        homePage.clickOnLink();
        consultingPage.verifyPageUrl();
        consultingPage.populateData();
        consultingPage.passCaptcha();
        consultingPage.clickOnSubmit();
        consultingPage.verifyIfSuccessfulMessageIsDisplayed();

        BrowserFactory.closeBrowser();
    }
}
