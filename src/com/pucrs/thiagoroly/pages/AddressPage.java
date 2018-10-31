package com.pucrs.thiagoroly.pages;

import com.pucrs.thiagoroly.setup.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.pucrs.thiagoroly.setup.Driver.waitElement;

public class AddressPage {

    @FindBy(how = How.XPATH , using = "//ul[@id='address_delivery']//li[@class='address_firstname address_lastname']")
    protected WebElement fullName;

    @FindBy(how = How.XPATH , using = "//ul[@id='address_delivery']//li[@class='address_address1 address_address2']")
    protected WebElement fullAddress;

    @FindBy(how = How.XPATH , using = "//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode']")
    protected WebElement zipCode;

    @FindBy(how = How.XPATH , using = "//ul[@id='address_delivery']//li[@class='address_country_name']")
    protected WebElement country;

    @FindBy(how = How.XPATH , using = "//ul[@id='address_delivery']//li[@class='address_phone_mobile']")
    protected WebElement mobilePhone;

    @FindBy(how = How.NAME , using = "processAddress")
    protected WebElement proceedToCheckoutButton;

    public AddressPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String verifyName() {
        return this.fullName.getText();
    }

    public String verifyAddress() {
        return this.fullAddress.getText();
    }

    public String verifyZipCode() {
       return this.zipCode.getText();
    }

    public String verifyCountry() {
        return this.country.getText();
    }

    public String verifyMobilePhone() {
        return this.mobilePhone.getText();
    }

    public ShippingPage proceedToCheckoutButtonClick() {
        waitElement(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
        return new ShippingPage();
    }
}
