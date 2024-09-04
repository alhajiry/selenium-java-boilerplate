package moneylion.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import moneylion.pages.BasePage;
import org.openqa.selenium.WebDriver;


public class Hooks extends BasePage{

    @Before
    public void setUp() {
        System.out.println("starting driver");
        WebDriver driver = WebDriverManager.getDriver();
    }

    @After
    public void tearDown() {
        System.out.println("terminating driver");
        WebDriverManager.quitDriver();
    }
}
