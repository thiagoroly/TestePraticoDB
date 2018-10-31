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
            //TODO: "Nome do cliente validado com sucesso.");
        } else {
            //TODO: "Nome do cliente está incorreto.");
            assertTrue(addressPage.verifyName().equals(fullName));
        }
    }

    public void verifyFullAddress(String fullAddress) {
        if(addressPage.verifyAddress().equals(fullAddress)) {
            //TODO: "Endereço do cliente validado com sucesso.");
        } else {
            //TODO: "Endereço do cliente está incorreto.");
            assertTrue(addressPage.verifyAddress().equals(fullAddress));
        }
    }

    public void verifyCityStateZipCode(String zipCode) {
        if(addressPage.verifyZipCode().equals(zipCode)) {
            //TODO: "Informações do cep do cliente validadas com sucesso.");
        } else {
            //TODO: "Informações do cep do cliente estão incorretas.");
            assertTrue(addressPage.verifyZipCode().equals(zipCode));
        }
    }

    public void verifyCountry(String country) {
        if(addressPage.verifyCountry().equals(country)) {
            //TODO: "País de residência do cliente validado com sucesso.");
        } else {
            //TODO: "País de residência do cliente está incorreto.");
            assertTrue(addressPage.verifyCountry().equals(country));
        }
    }

    public void verifyMobilePhone(String mobilePhone) {
        if(addressPage.verifyMobilePhone().equals(mobilePhone)) {
            //TODO: "Número de celular do cliente validado com sucesso.");
        } else {
            //TODO: "Número de celular do cliente está incorreto.");
            assertTrue(addressPage.verifyMobilePhone().equals(mobilePhone));
        }
    }

    public ShippingPage proceedToShipping() {
        addressPage.proceedToCheckoutButtonClick();
        //TODO: "Prosseguindo para tela de entrega."
        return new ShippingPage();
    }
}
