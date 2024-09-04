package moneylion.steps_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import moneylion.pages.BasePage;
import moneylion.pages.CareerPage;
import moneylion.pages.HomePage;
import moneylion.utils.ConfigManager;
import org.junit.jupiter.api.Assertions;

import static java.lang.Thread.sleep;

public class HomePageSteps extends BasePage {
    private HomePage homePage = new HomePage();
    private CareerPage careerPage = new CareerPage();
    @Given("I visit url")
    public void iVisitUrl() {
        driver.get(ConfigManager.getProperty("url"));
    }

    @When("I click a button")
    public void iClickAButton() throws InterruptedException {
        homePage.waitAndClickCareerPage();
//        Thread.sleep(10000);
        boolean isUrlOk = careerPage.checkCareerPageUrl();
        Assertions.assertTrue(isUrlOk, "the url does not match");

        boolean viewRolesButtonDisplayed = careerPage.isOpenRolesButtonDisplayed();
        Assertions.assertTrue(viewRolesButtonDisplayed, "view open roles button is not displayed");

        boolean isNextToElement = careerPage.isNextToElement();
        Assertions.assertTrue(isNextToElement, "The coordinate of elementA is not within elementB");

    }
}
