package moneylion.helpers;

import moneylion.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PageHelper extends BasePage {
    public PageHelper() {
       super();
    }

    public WebElement waitExplicitForElement(By locator, String expectedCondition, long time) {
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

        switch (expectedCondition.toLowerCase()) {
            case "visibilityof":
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
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

    public boolean urlToContains (String url, long time) {
        boolean isUrlOk;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        isUrlOk = wait.until(ExpectedConditions.urlContains(url));

        return isUrlOk;
    }

    public boolean isDisplayed(By locator, long time) {
        WebElement element = waitExplicitForElement(locator, "visibilityof", time);
        boolean isElementDisplayed = element.isDisplayed();
        return isElementDisplayed;
    }

    public boolean isElementANextoElementB(By selectorA, By selectorB, long time) {
        WebElement elementA = waitExplicitForElement(selectorA, "visibilityof", time);
        WebElement elementB = waitExplicitForElement(selectorB, "visibilityof", time);

        Point locationA = elementA.getLocation();
        Dimension sizeA = elementA.getSize();

        Point locationB = elementB.getLocation();
        Dimension sizeB = elementB.getSize();

        boolean topBoundary = locationA.getY() >= locationB.getY();
        boolean bottomBoundary = locationA.getY() <= (locationB.getY() + sizeB.getHeight());

//        boolean isYWithin = locationA.getX() >= locationB.getX() && locationA.getX() <= (locationB.getX() + sizeB.getHeight());
        System.out.println(locationA.getY());
        System.out.println(locationB.getY());

        boolean isYwithin = topBoundary && bottomBoundary;
        return isYwithin;
    }

}
