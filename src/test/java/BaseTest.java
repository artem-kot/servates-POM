/**
 * WebDriver settings
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

abstract public class BaseTest {
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        browser = "chrome";
        driverManagerEnabled = true;
        headless = true;
    }

    @BeforeAll
    public void init() {
        setUp();
    }

    @AfterAll
    public void teardown() {
        closeWebDriver();
    }
}
