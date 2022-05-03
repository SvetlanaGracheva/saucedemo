package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.InventoryPage;
import org.tms.service.LoginPageService;

public class LoginPageTest extends BaseTest {
    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void loginTest() {
        InventoryPage inventoryPage = loginPageService.login();
        String actualTextOfInventoryPage = inventoryPage.getTextOfNameOfMainPageSection();
        String expectedPageText = "PRODUCTS";
        Assert.assertEquals(actualTextOfInventoryPage, expectedPageText, "The actual text of the page does not match expected!");
    }

}
