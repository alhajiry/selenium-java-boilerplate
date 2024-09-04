package moneylion.pages;

import moneylion.helpers.PageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HomePage extends BasePage {

    private PageHelper pageHelper;
   public HomePage() {
       super();
       pageHelper = new PageHelper();
   }
    private By careerTextLink = By.xpath("//a[contains(@href, '/careers')]");

    public void waitAndClickCareerPage() {
        WebElement element = pageHelper.waitExplicitForElement(careerTextLink, "elementtobeclickable", 10);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
}
