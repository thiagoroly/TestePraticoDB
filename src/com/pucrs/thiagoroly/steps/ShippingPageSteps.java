package com.pucrs.thiagoroly.steps;

import com.pucrs.thiagoroly.pages.PaymentPage;
import com.pucrs.thiagoroly.pages.ShippingPage;

public class ShippingPageSteps {

    private ShippingPage shippingPage;

    public ShippingPageSteps(ShippingPage shippingPage){
        this.shippingPage = shippingPage;
    }

    public void agreeTermsOfService(){
        shippingPage.termsOfServiceCheckBoxCheck();
        //TODO: Termos de serviço aceitos.
    }

    public PaymentPage proceedToPayment(){
        PaymentPage paymentPage = shippingPage.proceedToCheckoutButtonClick();
        //TODO: "Prosseguindo para tela de pagamento.
        return  paymentPage;
    }
}
