package com.pucrs.thiagoroly.steps;

import com.pucrs.thiagoroly.pages.AddressPage;
import com.pucrs.thiagoroly.pages.SignInUpPage;

public class SignInUpPageSteps {

    private SignInUpPage signInUpPage;

    private String state;
    private String country;

    public SignInUpPageSteps(SignInUpPage signInUpPage){
        this.signInUpPage = signInUpPage;
        state = "";
    }

    public void createAnAccount(String email){
        signInUpPage.fillEmail(email);
        //TODO: "Email para cadastro preenchido
        signInUpPage.createAccount();
        //TODO: "Opção 'Criar uma conta' selecionada."
    }

    public void fillForm(String firstName, String lastName, String password, String address1, String address2,
                         String city, String zipCode, String mobilePhone, String reference){
        signInUpPage.selectGender();
        //TODO: "Pronome de tratamento selecionado.
        signInUpPage.fillFirstName(firstName);
        //TODO: "Primeiro nome do cliente preenchido.
        signInUpPage.fillLastName(lastName);
        //TODO:  "Último nome do cliente preenchido.
        signInUpPage.fillPassword(password);
        //TODO: "Senha preenchida.
        signInUpPage.selectBirthDay();
        //TODO: "Dia do nascimento selecionado.
        signInUpPage.selectBirthMonth();
        //TODO: "Mês do nascimento selecionado.
        signInUpPage.selectBirthYear();
        //TODO: "Ano do nascimento selecionado.
        signInUpPage.fillAddress1(address1);
        //TODO: "Endereço preenchido.
        signInUpPage.fillAddress2(address2);
        //TODO: "Complemento do endereco preenchido.
        signInUpPage.fillCity(city);
        //TODO: "Cidade preenchida.");
        state = signInUpPage.selectState();
        //TODO: "Estado preenchido.");
        signInUpPage.fillZipCode(zipCode);
        //TODO: "Código postal preenchido.");
        country = signInUpPage.verifyCountry();
        //TODO: "País preenchido.");
        signInUpPage.fillMobilePhone(mobilePhone);
        //TODO: "Número do celular preenchido.");
        signInUpPage.fillReferenceAddress(reference);
        //TODO: "Campo de referência preenchido.");
    }

    public AddressPage finishAccountCreation() {
        AddressPage addressPage = signInUpPage.registerButtonClick();
        //TODO: "Registro concluído.");
        return addressPage;
    }

    public String getState(){
        return state;
    }

    public String getCountry(){
        return country;
    }
}
