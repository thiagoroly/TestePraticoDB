package com.pucrs.thiagoroly.steps;

import com.pucrs.thiagoroly.pages.CartPage;
import com.pucrs.thiagoroly.pages.ProductPage;

public class ProductPageSteps {

    private ProductPage productPage;

    public ProductPageSteps(ProductPage productPage) {
        this.productPage = productPage;
    }

    public void addProductToCart(){
        productPage.addToCartButtonClick();
        //TODO: reporta "Produto adicionado ao carrinho
        //TODO: Printar e salvar evidência
    }

    public CartPage proceedToCheckout(){
        CartPage cartPage = productPage.proceedToCheckoutButtonClick();
        //TODO: reporta "Navegando para o carrinho
        //TODO: Printar e salvar evidência
        return cartPage;
    }
}
