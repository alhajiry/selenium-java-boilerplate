package moneylion.helpers;

import moneylion.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageHelper extends BasePage {
    public PageHelper() {
       super();
    }

    public WebElement waitExplicitForElement(By locator, String expectedCondition) {
        WebElement element = waitExplicitForElement(locator, expectedCondition, Duration.ofSeconds(10));
        return element;
    }

    public WebElement waitExplicitForElement(By locator, String expectedCondition, Duration time) {
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(driver, time);

        switch (expectedCondition.toLowerCase()) {
            case "visibilityof":
                element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
                break;
            case "elementtobeclickable":
                element = wait.until(ExpectedConditions.elementToBeClickable(locator));
                break;
            default:
                System.out.println("Method Name: waitexplicit-->Wrong expectedCondition passed : " + expectedCondition);
                break;
        }
        return element;
    }

}
