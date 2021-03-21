package ru.vvuri.pwtest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class PlaywrightSettings {
    public static Playwright playwright;
    public static Browser browser;

    @BeforeAll
    public static void setUp() {
        playwright = Playwright.create();
        // browser = playwright.chromium().connect("ws://127.0.0.1:4444/playwright/chrome/90.0");
        browser = playwright.chromium().launch();
        System.out.println("Start");
    }

    @AfterAll
    public static void terDown() {
        browser.close();
        playwright.close();
        System.out.println("Stop");
    }
}
