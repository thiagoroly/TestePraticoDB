package com.pucrs.thiagoroly.pages;

import com.pucrs.thiagoroly.setup.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.pucrs.thiagoroly.setup.Driver.waitElement;

public class ShippingPage {

    @FindBy(how = How.ID_OR_NAME, using = "uniform-cgv")
    protected WebElement checkBoxTermsOfService;

    @FindBy(how = How.NAME, using = "processCarrier")
    protected WebElement proceedToCheckoutButton;

    public ShippingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void termsOfServiceCheckBoxCheck() {
        waitElement(checkBoxTermsOfService);
        checkBoxTermsOfService.click();
    }

    public PaymentPage proceedToCheckoutButtonClick() {
        waitElement(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
        return new PaymentPage();
    }
}
