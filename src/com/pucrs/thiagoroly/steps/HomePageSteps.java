package com.pucrs.thiagoroly.steps;

import com.pucrs.thiagoroly.pages.HomePage;
import com.pucrs.thiagoroly.pages.ProductPage;

public class HomePageSteps {

    private HomePage homepage;

    public HomePageSteps(){
        this.homepage = new HomePage();
    }

    public void accessHomePage(){
        homepage.accessHomePage();
        //TODO: Website found successfully.
    }

    public ProductPage selectFirstProduct(){
        ProductPage productPage = homepage.firstProductClick();
        //TODO: Product Selected, proceeding to the detailed product page.
        return productPage;
    }
}
