package ru.vvuri.pwtest;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.nio.file.Paths;

public class FirstTest extends PlaywrightSettings {
    public static String BaseURL = "https://demoqa.com/elements";

    @Test
    @DisplayName("Open page and get title")
    public void firstTest() {
        Page page = browser.newPage();
        page.navigate(BaseURL);

        assert page.title().equals("Fast and reliable end-to-end testing for modern web apps | Playwright");
    }

    @Test
    @DisplayName("Clone test second")
    public void secondTest() {
        Page page = browser.newPage();
        page.navigate(BaseURL);

        assert page.title().equals("Fast and reliable end-to-end testing for modern web apps | Playwright");
    }

    @Test
    @DisplayName("Take screenshot page")
    public void screenshotTest() {
        Page page = browser.newPage();
        page.navigate(BaseURL);
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot-" + Math.random() + ".png")));
    }

}
