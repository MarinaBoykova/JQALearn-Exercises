package stepDefinitions;

import Homework10.helpers.BrowserFactory;
import Homework10.pages.ConsultingPage;
import Homework10.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Steps extends BrowserFactory {

    private HomePage homePage;
    private ConsultingPage consultingPage;

    // Background
    @Given("I am on the home page")
    public void iAmOnHomePage() {
        // Code to navigate to the home page
        WebDriver driver = BrowserFactory.startBrowser("chrome", "https://ultimateqa.com/");
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.consultingPage = PageFactory.initElements(driver, ConsultingPage.class);
    }

    @And("Verify navigation link is present")
    public void verifyNavigationLinkIsPresent() {
        this.homePage.verifyLinkIsPresent();
    }

    @When("Click on navigation link")
    public void clickOnNavigationLink() {
        this.homePage.clickOnLink();
    }

    @Then("Page URL should be \"https://ultimateqa.com/consulting/\"$")
    public void page_url_should_be() {
        this.consultingPage.verifyPageUrl();
    }

    // Scenario steps
    @Given("I am on Consulting page")
    public void iAmOnConsultingPage() {
        this.consultingPage.verifyPageUrl();
    }

    @When("Fill all required fields for a message")
    public void fillAllRequiredFieldsForAMessage() {
        this.consultingPage.populateData();
    }

    @When("Fill all required fields without Name")
    public void fillAllRequiredFieldsWithoutName() {
        this.consultingPage.populateDataWithoutName();
    }

    @When("Fill all required fields with wrong email format")
    public void fillAllRequiredFieldsWithWrongEmail() {
        this.consultingPage.populateDataWithWrongEmail();
    }

    @And("Pass captcha")
    public void passCaptcha() {
        this.consultingPage.passCaptcha();
    }

    @And("^Click the \"Send Message\" button$")
    public void clickOnSubmit() {
        this.consultingPage.clickOnSubmit();
    }

    @Then("I see message sent successfully")
    public void iSeeMessageSentSuccessfully() {
        this.consultingPage.verifyIfSuccessfulMessageIsDisplayed();
    }

    @Then("I see validation message for email")
    public void iSeeValidationMessageForEmail() {
        this.consultingPage.verifyValidationForEmail();
    }

    @Then("I see validation message for name")
    public void iSeeValidationMessageForName() {
        this.consultingPage.verifyValidationForName();
    }

    @After
    public void close() {
        BrowserFactory.closeBrowser();
    }
}
