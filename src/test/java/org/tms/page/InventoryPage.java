package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryPage extends Page {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement quantityOfItemsAddedToCart;

    @FindBy(xpath = "//button[contains(text(), 'Add to cart')]")
    private List<WebElement> addItemToCartButton;

    @FindBy(xpath = "//button[contains(text(), 'Remove')]")
    private List<WebElement> removeItemFromCartButton;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private List<WebElement> priceOfItem;

    public String getTextOfNameOfMainPageSection() {
        return nameOfMainPageSection.getText();
    }

    public void clickShoppingCartButton() {
        shoppingCartButton.click();
    }

    public int getQuantityOfItemsAddedToCart() {
        return Integer.valueOf(quantityOfItemsAddedToCart.getText());
    }

    public void clickAddItemToCartButtonByIndex(int index) {
        addItemToCartButton.get(index).click();
    }

    public void clickRemoveItemFromCartButtonByIndex(int index) {
        removeItemFromCartButton.get(index).click();
    }

    public String getTextOfPriceOfItemByIndex(int index) {
        return priceOfItem.get(index).getText();
    }

}
