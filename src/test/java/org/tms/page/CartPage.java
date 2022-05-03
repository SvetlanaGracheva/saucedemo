package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Page {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement cartPageTitle;

    @FindBy(xpath = "//div[@class='cart_quantity']")
    private WebElement quantityOfAnItemInCart;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement nameOfAnItemInCart;

    @FindBy(xpath = "//div[@class='inventory_item_desc']")
    private WebElement descriptionOfAnItemInCart;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private WebElement priceOfAnItemInCart;

    @FindBy(xpath = "//div[@class='removed_cart_item']")
    private WebElement emptyCartList;

    @FindBy(xpath = "//button[@name='remove-sauce-labs-backpack']")
    private WebElement removeButton;

    @FindBy(xpath = "//button[@name='continue-shopping']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//button[@name='checkout']")
    private WebElement checkoutButton;

    public String getTextOfCartPageTitle() {
        return cartPageTitle.getText();
    }

    public String getTextOfQuantityOfAnItemInCart() {
        return quantityOfAnItemInCart.getText();
    }

    public String getTextOfNameOfAnItemInCart() {
        return nameOfAnItemInCart.getText();
    }

    public String getTextOfDescriptionOfAnItemInCart() {
        return descriptionOfAnItemInCart.getText();
    }

    public String getTextOfPriceOfAnItemInCart() {
        return priceOfAnItemInCart.getText();
    }

    public void clickRemoveButton() {
        removeButton.click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public Boolean verifyTheCartListIsEmpty() {
        return emptyCartList.isDisplayed();
    }
}
