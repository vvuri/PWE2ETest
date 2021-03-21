package com.vvuri;

import com.microsoft.playwright.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Playwright W2W Tests");

//        try (
//            Playwright playwright = Playwright.create()) {
//            Browser browser = playwright.chromium().connect("ws://127.0.0.1:4444/playwright/chrome/90.0");
//-                Browser browser = playwright.firefox().connect("ws://127.0.0.1:4444/playwright/firefox");
//-                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
//-                        .setHeadless(false)
//-                        .setSlowMo(100));
//                Page page = browser.newPage();
//                page.navigate("http://playwright.dev");
//                System.out.println(page.title());
//                assert page.title().equals("Fast and reliable end-to-end testing for modern web apps | Playwright");
//
//                page = browser.newPage();
//                page.navigate("https://www.wikipedia.org/");
//                page.click("input[name=\"search\"]");
//                page.fill("input[name=\"search\"]", "123");
//-                page.Screenshot(playwright.PageScreenshotOptions{
//-                    Path: playwright.String("foo.png"),
//-                });
//            System.out.println(page.title());
//                assert page.title().equals("Wikipedia");
//
//-            page.waitForNavigation(() -> {
//-                page.click("button:has-text(\"Search\")");
//-            });
//-            page.navigate("https://ru.wikipedia.org/wiki/%D0%AE%D0%BB%D0%B8%D0%B0%D0%BD%D1%81%D0%BA%D0%B8%D0%B9_%D0%BA%D0%B0%D0%BB%D0%B5%D0%BD%D0%B4%D0%B0%D1%80%D1%8C");
//-            page.click("text=3 Март 31 >> a");
//-            assert page.url().equals("https://ru.wikipedia.org/wiki/%D0%9C%D0%B0%D1%80%D1%82");
//        }
    }
}
