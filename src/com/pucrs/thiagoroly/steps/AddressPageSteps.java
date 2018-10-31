package com.pucrs.thiagoroly.steps;

import com.pucrs.thiagoroly.pages.AddressPage;
import com.pucrs.thiagoroly.pages.ShippingPage;

import static org.junit.Assert.assertTrue;

public class AddressPageSteps {

    private AddressPage addressPage;

    public AddressPageSteps(AddressPage addressPage){
        this.addressPage = addressPage;
    }

    public void verifyName(String fullName) {
        if(addressPage.verifyName().equals(fullName)) {
            //TODO: Successfully validated customer name.
        } else {
            //TODO: Client name is incorrect.
            assertTrue(addressPage.verifyName().equals(fullName));
        }
    }

    public void verifyFullAddress(String fullAddress) {
        if(addressPage.verifyAddress().equals(fullAddress)) {
            //TODO: Successfully validated customer address.
        } else {
            //TODO: Customer address is incorrect.
            assertTrue(addressPage.verifyAddress().equals(fullAddress));
        }
    }

    public void verifyCityStateZipCode(String zipCode) {
        if(addressPage.verifyZipCode().equals(zipCode)) {
            //TODO: Successfully validated client zip code.
        } else {
            //TODO: Costumer zip code is incorrect.
            assertTrue(addressPage.verifyZipCode().equals(zipCode));
        }
    }

    public void verifyCountry(String country) {
        if(addressPage.verifyCountry().equals(country)) {
            //TODO: Costumer country successfully validated.
        } else {
            //TODO: Costumer country is incorrect.
            assertTrue(addressPage.verifyCountry().equals(country));
        }
    }

    public void verifyMobilePhone(String mobilePhone) {
        if(addressPage.verifyMobilePhone().equals(mobilePhone)) {
            //TODO: Successfully validated customer's cell phone number.
        } else {
            //TODO: Customer's cell number is incorrect.
            assertTrue(addressPage.verifyMobilePhone().equals(mobilePhone));
        }
    }

    public ShippingPage proceedToShipping() {
        addressPage.proceedToCheckoutButtonClick();
        //TODO: Proceeding to the delivery page.
        return new ShippingPage();
    }
}
