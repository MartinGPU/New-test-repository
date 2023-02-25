package com.marat.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "1366x768";
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", true);
//        Configuration.browserCapabilities = capabilities;
//        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
    }
}
