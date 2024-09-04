package moneylion.steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import moneylion.pages.BasePage;
import moneylion.pages.CareerPage;
import moneylion.pages.HomePage;
import moneylion.utils.ConfigManager;
import moneylion.utils.PageObjectManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class CareerPageSteps extends BasePage {
    private PageObjectManager pageObjectManager;
    private CareerPage careerPage;

    public CareerPageSteps() {
        pageObjectManager = new PageObjectManager();
        careerPage = pageObjectManager.careerPage();
    }

    @Then("I should redirected to MoneyLion's careers page")
    public void iShouldRedirectedToCareerPage() {
        careerPage.verifyCareerPageUrl();
    }

    @And("^I should be able to see '([^\']*)' displayed next to '([^\']*)'$")
    public void iShouldBeAbleToSeeElementDisplayedNextToElement(String element1, String element2) throws NoSuchFieldException, IllegalAccessException {
        By firstElement = getLocatorByName(element1, careerPage);
        By secondElement = getLocatorByName(element2, careerPage);

        Assertions.assertTrue(careerPage.careerPageElementDisplayed(firstElement), element1 + "i s not displayed");  ;
        Assertions.assertTrue(careerPage.careerPageElementDisplayed(secondElement), element2 + "i s not displayed");  ;
    }

    @And("^I should be able to see '([^\']*)' displayed next to '([^\']*)' according to coordinate$")
    public void iShouldBeAbleToSeeElementDisplayedNextToElementUsingCoordinate(String element1, String element2) throws NoSuchFieldException, IllegalAccessException {
        By firstElement = getLocatorByName(element1, careerPage);
        By secondElement = getLocatorByName(element2, careerPage);

        boolean isSibling = careerPage.isNextToElement(firstElement, secondElement);
        Assertions.assertTrue(isSibling, element1 + "is not a sibling of element" + element2);
    }
}
