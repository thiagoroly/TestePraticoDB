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
        //TODO: Reporta Acesso com sucesso
        //TODO: Printar e salvar evidência
    }

    public ProductPage selectFirstProduct(){
        ProductPage productPage = homepage.firstProductClick();
        //TODO: Reporta Produto selecionado
        //TODO: Printar e salvar evidência
        return productPage;
    }
}
