package com.marat.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class GitTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "1366x768";
    }

    @Test
    public void testForGit() {
        Selenide.open("https://www.avito.ru/");
        $(".top-rubricator-rubricatorButton-SoKyQ").click();
        sleep(4000);
    }
}
