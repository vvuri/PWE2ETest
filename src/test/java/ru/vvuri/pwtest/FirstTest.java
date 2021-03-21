package ru.vvuri.pwtest;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTest extends PlaywrightSettings {

    @Test
    @DisplayName("Open page and get title")
    public void firstTest() {
        Page page = browser.newPage();
        page.navigate("http://playwright.dev");

        assert page.title().equals("Fast and reliable end-to-end testing for modern web apps | Playwright");
    }

    @Test
    @DisplayName("Clone test second")
    public void secondTest() {
        Page page = browser.newPage();
        page.navigate("http://playwright.dev");

        assert page.title().equals("Fast and reliable end-to-end testing for modern web apps | Playwright");
    }

}
