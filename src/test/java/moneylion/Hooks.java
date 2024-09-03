package moneylion;

import moneylion.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Hooks {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverManager.getDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
