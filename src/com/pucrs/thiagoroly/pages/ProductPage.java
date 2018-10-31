package com.pucrs.thiagoroly.pages;

import com.pucrs.thiagoroly.setup.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.pucrs.thiagoroly.setup.Driver.scrollElement;
import static com.pucrs.thiagoroly.setup.Driver.waitElement;

public class ProductPage {

    @FindBy(how = How.XPATH, using = "//p[@id='add_to_cart']//button")
    protected WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "//a[@title='Proceed to checkout']")
    protected WebElement proceedToCheckoutButton;

    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void addToCartButtonClick() {
        waitElement(addToCartButton);
        addToCartButton.click();
    }

    public CartPage proceedToCheckoutButtonClick() {
        waitElement(proceedToCheckoutButton);
        scrollElement(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
        return new CartPage();
    }

}
