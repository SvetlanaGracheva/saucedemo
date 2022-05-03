package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.CartPage;
import org.tms.page.InventoryPage;
import org.tms.service.LoginPageService;

public class CartPageButtonsTest extends BaseTest {
    private InventoryPage inventoryPage;
    private LoginPageService loginPageService;
    private CartPage cartPage;
    private static int firstItem;

    @BeforeClass
    public void login() {
        inventoryPage = new InventoryPage();
        loginPageService = new LoginPageService();
        cartPage = new CartPage();
        firstItem = 0;
        loginPageService.login();
        inventoryPage.clickAddItemToCartButtonByIndex(firstItem);
        inventoryPage.clickShoppingCartButton();
    }

    @Test(priority = 1)
    public void verifyItemRemovedFromCartWhenClickingRemoveButtonTest() {
        cartPage.clickRemoveButton();
        Boolean actualCartListDisplayed = cartPage.verifyTheCartListIsEmpty();
        Boolean expectedCartListDisplayed = false;
        Assert.assertEquals((boolean) actualCartListDisplayed, (boolean) expectedCartListDisplayed, "The cart isn't empty");
    }

    @Test(priority = 2)
    public void verifyTransferToInventoryPageWhenClickingContinueShoppingButtonTest() {
        cartPage.clickContinueShoppingButton();
        String actualTextOfInventoryPage = inventoryPage.getTextOfNameOfMainPageSection();
        String expectedPageText = "PRODUCTS";
        Assert.assertEquals(actualTextOfInventoryPage, expectedPageText, "Actual text doesn't match expected one!");
    }

}
