package moneylion.pages;

import moneylion.helpers.PageHelper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CareerPage extends BasePage {
    private PageHelper pageHelper;
    public CareerPage() {
        super();
        pageHelper = new PageHelper();
    }

    public By whereWeWorkContainer = By.xpath("//h2[contains(text(), 'Where we work')]//..");
    public By whereWeWorkText = By.xpath("//h2[contains(text(), 'Where we work')]");
    public By whereWeWorkSiblingElement = By.xpath("//h2[contains(text(), 'Where we work')]/../../../following-sibling::div/div[contains(@class, 'where-we-work-cities')]");
    public By viewOpenRolesButton = By.xpath("//a[contains(@href, '#OpenRoles')]");
    public By cityGridContainer = By.xpath("//figcaption[contains(text(), 'New York City')]/ancestor::div[contains(@class, 'where-we-work-cities')]");
    public By cityGridContainerSiblingElement = By.xpath("//div[contains(@class, 'where-we-work-cities')]/../preceding-sibling::div/descendant::h2[contains(text(), 'Where we work')]");

    public boolean verifyCareerPageUrl() {
        boolean isUrlOk;
        isUrlOk = pageHelper.urlToContains("moneylion.com/careers", 10);

        return isUrlOk;
    }

    public boolean careerPageElementDisplayed(By locator) {
        boolean isElementDisplayed;
        isElementDisplayed = pageHelper.isDisplayed(locator, 10);
        return isElementDisplayed;
    }

    public boolean isNextToElement(By element1, By element2) {
        boolean isNextToElement;
        isNextToElement = pageHelper.isElementANextoElementB(element1, element2, 10);
        return isNextToElement;
    }

}
