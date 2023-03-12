package com.marat.test;

import com.codeborne.selenide.Configuration;
import com.marat.config.CredentialsConfig;
import com.marat.pages.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    public static CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
    AuthPage authPage = new AuthPage();
    BookingAHotelPage bookingAHotelPage = new BookingAHotelPage();
    SearchStoriesPage searchStoriesPage = new SearchStoriesPage();
    TicketSearchPage ticketSearchPage = new TicketSearchPage();
    UpdateUserDataPage updateUserDataPage = new UpdateUserDataPage();
    FileDownloadPage fileDownloadPage = new FileDownloadPage();

    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = "https://www.tutu.ru/";
        Configuration.browserVersion = System.getProperty("version", "110.0.1");
        Configuration.browserSize = System.getProperty("size", "1366x900");
        Configuration.browser = System.getProperty("browser", "firefox");
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", true);
//        Configuration.browserCapabilities = capabilities;
//        Configuration.remote = String.format("https://%s:%s@%s", credentials.remoteLogin(), credentials.remotePassword(), credentials.remoteUrl());
    }

//    @AfterEach
//    public void tearDown() {
//        Attach.screenshotAs("Last screen");
//        Attach.pageSource();
//        //Attach.browserConsoleLogs();
//        Attach.addVideo();
//    }
}
