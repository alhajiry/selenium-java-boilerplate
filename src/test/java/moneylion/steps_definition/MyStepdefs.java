package moneylion.steps_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import moneylion.pages.BasePage;
import moneylion.pages.HomePage;
import moneylion.utils.ConfigManager;

public class MyStepdefs extends BasePage {
    private HomePage homePage = new HomePage();
    @Given("I visit url")
    public void iVisitUrl() {
        driver.get(ConfigManager.getProperty("url"));
    }

    @When("I click a button")
    public void iClickAButton() {
        homePage.waitAndClickCareerPage();
    }
}
