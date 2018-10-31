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
        //TODO: E-mail filled out.
        signInUpPage.createAccount();
        //TODO: Create an account 'option selected.
    }

    public void fillForm(String firstName, String lastName, String password, String address1, String address2,
                         String city, String zipCode, String mobilePhone, String reference){
        signInUpPage.selectGender();
        //TODO: Selected treatment pronoun.
        signInUpPage.fillFirstName(firstName);
        //TODO: First name fill out.
        signInUpPage.fillLastName(lastName);
        //TODO:  Last name fill out.
        signInUpPage.fillPassword(password);
        //TODO: Password fill out.
        signInUpPage.selectBirthDay();
        //TODO: Birth day selected.
        signInUpPage.selectBirthMonth();
        //TODO: Birth selected.
        signInUpPage.selectBirthYear();
        //TODO: Birth year selected.
        signInUpPage.fillAddress1(address1);
        //TODO: Address1 fill out.
        signInUpPage.fillAddress2(address2);
        //TODO: Address2 fill out.
        signInUpPage.fillCity(city);
        //TODO: City fill out.
        state = signInUpPage.selectState();
        //TODO: State fill out.
        signInUpPage.fillZipCode(zipCode);
        //TODO: "Zip code fill out.
        country = signInUpPage.verifyCountry();
        //TODO: Country verified.
        signInUpPage.fillMobilePhone(mobilePhone);
        //TODO: Phone number fill out.
        signInUpPage.fillReferenceAddress(reference);
        //TODO: Reference fill out.
    }

    public AddressPage finishAccountCreation() {
        AddressPage addressPage = signInUpPage.registerButtonClick();
        //TODO: Registration completed.
        return addressPage;
    }

    public String getState(){
        return state;
    }

    public String getCountry(){
        return country;
    }
}
