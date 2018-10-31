package com.pucrs.thiagoroly.pages;

import com.pucrs.thiagoroly.setup.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.pucrs.thiagoroly.setup.Driver.waitElement;

public class PaymentPage {

    @FindBy(how = How.ID, using = "total_price")
    protected WebElement totalPrice;

    @FindBy(how = How.CLASS_NAME, using = "bankwire")
    protected WebElement bankWirePaymentButton;

    @FindBy(how = How.CSS, using = "#cart_navigation > button")
    protected WebElement confirmOrderButton;

    @FindBy(how = How.CSS, using = "#center_column > div > p > strong")
    protected WebElement orderConfirmationLabel;

    @FindBy(how = How.XPATH, using = "//a[@title='Back to orders']")
    protected WebElement backToOrderButton;

    public PaymentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String verifyTotalPrice() {
        waitElement(totalPrice);
        return totalPrice.getText();
    }

    public void bankWirePaymentButtonClick() {
        waitElement(bankWirePaymentButton);
        bankWirePaymentButton.click();
    }

    public void confirmOrderButtonClick() {
        waitElement(confirmOrderButton);
        confirmOrderButton.click();
    }

    public boolean verifyOrderConfirmationLabel() {
        waitElement(orderConfirmationLabel);
        return orderConfirmationLabel.isDisplayed();
    }

    public boolean verifyBackToOrderButton() {
        waitElement(backToOrderButton);
        return backToOrderButton.isDisplayed();
    }

}
