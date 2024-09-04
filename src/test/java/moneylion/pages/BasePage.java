package moneylion.pages;

import moneylion.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = WebDriverManager.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}