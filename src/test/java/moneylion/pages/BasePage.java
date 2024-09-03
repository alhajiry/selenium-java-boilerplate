package moneylion.pages;

import moneylion.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        WebDriverManager webDriverManager = new WebDriverManager();
        this.driver = webDriverManager.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}