package tests;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import drivers.AppiumDriver;
import drivers.BrowserstackDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        if (System.getProperty("deviceHost") == null) {
            System.setProperty("deviceHost", "browserstack");
        }
        switch (System.getProperty("deviceHost")) {
            case "browserstack":
                Configuration.browser = BrowserstackDriver.class.getName();
                break;

            case "emulation", "real":
                Configuration.browser = AppiumDriver.class.getName();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + System.getProperty("deviceHost"));
        }
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        String sessionId = Selenide.sessionId().toString();
        Attach.pageSource();
        closeWebDriver();
        if (System.getProperty("deviceHost").equals("browserstack")) {
            Attach.addVideo(sessionId);
        }
    }
}
