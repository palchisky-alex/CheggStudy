package com.chegg.web.core;

import com.chegg.web.pages.GoogleTranslatePage;
import com.chegg.web.pages.HomePage;
import com.chegg.web.pages.TranslateSitesPage;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public class BaseTest {
    PlaywrightFactory pf;
    public Page page;
    protected HomePage app;
    protected GoogleTranslatePage googleTranslatePage;
    protected TranslateSitesPage translateSites;

    @BeforeEach
    public void setUp() {
        pf = new PlaywrightFactory();
        page = pf.initBrowser();
        app = new HomePage(page);
    }



    @AfterEach
    public void tearDown(TestInfo testInfo){
        pf.stop(testInfo);

    }
}
