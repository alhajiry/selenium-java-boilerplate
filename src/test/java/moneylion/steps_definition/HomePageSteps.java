package moneylion.steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import moneylion.pages.BasePage;
import moneylion.pages.CareerPage;
import moneylion.pages.HomePage;
import moneylion.utils.ConfigManager;
import moneylion.utils.PageObjectManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class HomePageSteps extends BasePage {
    private PageObjectManager pageObjectManager;
    private HomePage homePage;

    public HomePageSteps() {
        pageObjectManager = new PageObjectManager();
        homePage = pageObjectManager.homePage();
    }

    @Given("I am a new customer")
    public void iAmANewCustomer() {
        System.out.println("I am a new customer executed");
    }
    @And("I access the MoneyLion website")
    public void iAccessWebsite() {
        driver.get(ConfigManager.getProperty("url"));
    }

    @When("^I hover on '([^\']*)' and click on '([^\']*)' at the bottom of the webpage$")
    public void iHoverAndClickOnButtonAtTheBottomOfTheWebPage(String element1, String element2) {
        WebElement elementToHover = homePage.findHomePageElementWithText(element1, 10);
        homePage.hoverToHomePageElement(elementToHover);

        WebElement elementToClick = homePage.findHomePageElementWithText(element2,10);
//        homePage.hoverToHomePageElement(elementToClick);
        homePage.clickHomePageElement(elementToClick);
    }
}
