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
            //TODO: The cart is empty.
        }
        else {
            //TODO: The cart has at least one product.
        }
    }

    public String verifyTotalPrice(){
        return cartPage.verifyTotalPrice();
    }

    public SignInUpPage proceedToCheckoutLogin(){
        SignInUpPage signInUpPage = cartPage.proceedToCheckoutButtonClick();
        //TODO: Proceeding to the Checkout / Login page.
        return signInUpPage;
    }
}
