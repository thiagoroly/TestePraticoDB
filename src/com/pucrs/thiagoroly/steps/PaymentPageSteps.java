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

            //TODO: "Preço total validado com sucesso
        } else {
            //TODO: "Preço total inválido.");
            assertTrue(paymentPage.verifyTotalPrice().equals(totalPrice));
        }
    }

    public void selectBankwirePayment() {
        paymentPage.bankWirePaymentButtonClick();
        //TODO: "Pagamento por transferência foi selecionado
    }

    public void confirmOrder() {
        paymentPage.confirmOrderButtonClick();
        //TODO: "Confirmando pedido
    }

    public void validateSuccessfulOrder() {
        if(paymentPage.verifyOrderConfirmationLabel() && paymentPage.verifyBackToOrderButton()) {
            //TODO: "Pedido concluído com sucesso!");
        } else {
            //TODO: "Pedido não foi concluído!
            assertTrue((paymentPage.verifyOrderConfirmationLabel() && paymentPage.verifyBackToOrderButton()));
        }
    }
}
