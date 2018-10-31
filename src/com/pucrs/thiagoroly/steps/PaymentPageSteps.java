package com.pucrs.thiagoroly.steps;

import com.pucrs.thiagoroly.pages.PaymentPage;

import static org.junit.Assert.assertTrue;

public class PaymentPageSteps {

    private PaymentPage paymentPage;

    public PaymentPageSteps(PaymentPage paymentPage){
        this.paymentPage = paymentPage;
    }

    public void verifyTotalPrice(String totalPrice) {
        if(paymentPage.verifyTotalPrice().equals(totalPrice)) {
            //TODO: Total price successfully validated
        } else {
            //TODO: Invalid total price.
            assertTrue(paymentPage.verifyTotalPrice().equals(totalPrice));
        }
    }

    public void selectBankwirePayment() {
        paymentPage.bankWirePaymentButtonClick();
        //TODO: Payment by bankWire was selected.
    }

    public void confirmOrder() {
        paymentPage.confirmOrderButtonClick();
        //TODO: Order confirmed.
    }

    public void validateSuccessfulOrder() {
        if(paymentPage.verifyOrderConfirmationLabel() && paymentPage.verifyBackToOrderButton()) {
            //TODO: Order completed successfully!
        } else {
            //TODO: Order was not completed!
            assertTrue((paymentPage.verifyOrderConfirmationLabel() && paymentPage.verifyBackToOrderButton()));
        }
    }
}
