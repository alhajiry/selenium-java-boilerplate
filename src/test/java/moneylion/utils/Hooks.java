package moneylion.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import moneylion.pages.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Hooks extends BasePage{

    @Before
    public void setUp() {
        System.out.println("starting driver");
        WebDriver driver = WebDriverManager.getDriver();
    }

    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
        System.out.println("taking screenshots");
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Screenshot");
        System.out.println("Screenshot taken for scenario: " + scenario.getName());
    }

    @After(order = 0)
    public void tearDown() {
        System.out.println("terminating driver");
        WebDriverManager.quitDriver();
    }
}
