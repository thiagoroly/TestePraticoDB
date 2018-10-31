package com.pucrs.thiagoroly.pages;

import com.pucrs.thiagoroly.setup.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.pucrs.thiagoroly.setup.Driver.scrollElement;
import static com.pucrs.thiagoroly.setup.Driver.waitElement;

public class CartPage {

    @FindBy(how = How.CLASS_NAME, using = "cart_product")
    protected WebElement cartProduct;

    @FindBy(how = How.XPATH, using = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
    protected WebElement proceedToCheckoutButton;

    @FindBy(how = How.ID, using = "total_price")
    protected WebElement totalPrice;

    public CartPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean verifyCartIsEmpty() {
        waitElement(cartProduct);
        return !cartProduct.isDisplayed();
    }

    public String verifyTotalPrice(){
        waitElement(totalPrice);
        return totalPrice.getText();
    }

    public SignInUpPage proceedToCheckoutButtonClick() {
        waitElement(proceedToCheckoutButton);
        scrollElement(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
        return new SignInUpPage();
    }
}
