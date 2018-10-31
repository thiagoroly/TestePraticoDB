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
        //TODO: Product added to cart
    }

    public CartPage proceedToCheckout(){
        CartPage cartPage = productPage.proceedToCheckoutButtonClick();
        //TODO: Proceeding to cart page.
        return cartPage;
    }
}
