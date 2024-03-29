package com.marat.test;

import com.marat.config.CredentialsConfig;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.marat.pages.SearchStoriesPage.*;
import static io.qameta.allure.Allure.step;

@Feature("Story search")
public class SearchStoriesTests extends TestBase {

    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("smoke")
    @DisplayName("Stories")
    @AllureId("15136")
    public void searchStories() {
        step("Open home page", () -> {
            open(credentials.url());
        });

        step("Clicking to stories", () -> {
            $(plots).click();
        });

        step("Clicking to search item", () -> {
            $(searchItem).click();
        });

        step("Set desired story", () -> {
            $(searchBox).setValue(TestData.desiredStory).pressEnter();
        });

        step("Checking results of story search", () -> {
            $(searchResults).shouldHave(text(TestData.desiredStory));
            sleep(6000);
        });
    }
}
