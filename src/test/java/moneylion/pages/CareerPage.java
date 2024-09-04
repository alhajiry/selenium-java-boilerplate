package moneylion.pages;

import moneylion.helpers.PageHelper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class CareerPage extends BasePage {
    private PageHelper pageHelper;
    public CareerPage() {
        super();
        pageHelper = new PageHelper();
    }

    private By whereWeWorkContainer = By.xpath("//h2[contains(text(), 'Where we work')]//..");
    private By whereWeWorkText = By.xpath("//h2[contains(text(), 'Where we work')]");
    private By whereWeWorkContainerSibling = By.xpath("//h2[contains(text(), 'Where we work')]/ancestor::div[3]/following-sibling::div/descendant::figcaption[contains(text(), 'Around the globe')]");
    private By viewOpenRolesButton = By.xpath("//a[contains(@href, '#OpenRoles')]");
    private By cityGridContainer = By.xpath("//figcaption[contains(text(), 'New York City')]/ancestor::div[contains(@class, 'where-we-work-cities')]");

    public boolean checkCareerPageUrl() {
        boolean isUrlOk;
        isUrlOk = pageHelper.urlToContains("moneylion.com/careers", 10);

        return isUrlOk;
    }

    public boolean isOpenRolesButtonDisplayed() {
        boolean isElementDisplayed;
        isElementDisplayed = pageHelper.isDisplayed(viewOpenRolesButton, 10);
        return isElementDisplayed;
    }

    public boolean isWhereWeWorkSiblingDisplayed() {
        boolean isElementDisplayed;
        isElementDisplayed = pageHelper.isDisplayed(whereWeWorkContainerSibling, 10);
        return isElementDisplayed;
    }

    public boolean isNextToElement() {
        boolean isNextToElement;
        isNextToElement = pageHelper.isElementANextoElementB(whereWeWorkText, cityGridContainer, 10);
        return isNextToElement;
    }

}
