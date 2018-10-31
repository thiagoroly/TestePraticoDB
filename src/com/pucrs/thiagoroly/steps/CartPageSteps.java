package com.pucrs.thiagoroly.steps;

import com.pucrs.thiagoroly.pages.CartPage;
import com.pucrs.thiagoroly.pages.SignInUpPage;

public class CartPageSteps {

    private CartPage cartPage;

    public CartPageSteps(CartPage cartPage){
        this.cartPage = cartPage;
    }

    public void validateProductAdded(){
        if(cartPage.verifyCartIsEmpty()){
            //TODO: "O carrinho está vazio."
        }
        else {
            //TODO: "O carrinho possui ao menos um produto."
        }
        //TODO: Printar e salvar evidência
    }

    public String verifyTotalPrice(){
        return cartPage.verifyTotalPrice();
    }

    public SignInUpPage proceedToCheckoutLogin(){
        SignInUpPage signInUpPage = cartPage.proceedToCheckoutButtonClick();
        //TODO: "Prosseguindo para a tela de Checkout/Login."
        //TODO: Printar e salvar evidência
        return signInUpPage;
    }
}
