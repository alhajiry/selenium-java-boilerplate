package moneylion.pages;

import moneylion.utils.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Field;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = WebDriverManager.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static By getLocatorByName(String fieldName, Object pageObject) throws NoSuchFieldException, IllegalAccessException {
        Field field = pageObject.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return (By) field.get(pageObject);
    }

}