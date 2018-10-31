package com.pucrs.thiagoroly.pages;

import com.pucrs.thiagoroly.setup.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.pucrs.thiagoroly.setup.Driver.scrollElement;
import static com.pucrs.thiagoroly.setup.Driver.waitElement;

public class SignInUpPage {

    @FindBy(how = How.ID_OR_NAME, using = "email_create")
    protected WebElement emailToCreateAccountField;

    @FindBy(how = How.ID_OR_NAME, using = "SubmitCreate")
    protected WebElement createAccountButton;

    @FindBy(how = How.ID_OR_NAME, using = "id_gender2")
    protected WebElement radioGender;

    @FindBy(how = How.ID_OR_NAME, using = "customer_firstname")
    protected WebElement firstNameField;

    @FindBy(how = How.ID_OR_NAME, using = "customer_lastname")
    protected WebElement lastNameField;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    protected WebElement passwordField;

    @FindBy(how = How.ID, using = "uniform-days")
    protected WebElement dayDropdown;

    @FindBy(how = How.CSS, using = "#days > option:nth-child(6)")
    protected WebElement dayOption;

    @FindBy(how = How.ID, using = "uniform-months")
    protected WebElement monthDropdown;

    @FindBy(how = How.CSS, using = "#months > option:nth-child(5)")
    protected WebElement monthOption;

    @FindBy(how = How.ID_OR_NAME, using = "uniform-years")
    protected WebElement yearDropdown;

    @FindBy(how = How.CSS, using = "#years > option:nth-child(25)")
    protected WebElement yearOption;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    protected WebElement address1Field;

    @FindBy(how = How.ID_OR_NAME, using = "address2")
    protected WebElement address2Field;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    protected WebElement cityField;

    @FindBy(how = How.ID_OR_NAME, using = "uniform-id_state")
    protected WebElement stateField;

    @FindBy(how = How.CSS, using = "#id_state > option:nth-child(18)")
    protected WebElement stateOption;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    protected WebElement zipCodeField;

    @FindBy(how = How.XPATH, using = "//div[@id='uniform-id_country']//option[@value='21']")
    protected WebElement countryOption;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    protected WebElement mobilePhoneField;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    protected WebElement referenceAddress;

    @FindBy(how = How.ID, using = "submitAccount")
    protected WebElement registerButton;

    public SignInUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void fillEmail(String email) {
        waitElement(emailToCreateAccountField);
        emailToCreateAccountField.sendKeys(email);
    }

    public void createAccount() {
        waitElement(createAccountButton);
        createAccountButton.click();
    }

    public void selectGender() {
        waitElement(radioGender);
        radioGender.click();
    }

    public void fillFirstName(String firstName) {
        waitElement(firstNameField);
        scrollElement(firstNameField);
        firstNameField.sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        waitElement(lastNameField);
        lastNameField.sendKeys(lastName);
    }

    public void fillPassword(String password) {
        waitElement(passwordField);
        passwordField.sendKeys(password);
    }

    public void selectBirthDay() {
        waitElement(dayDropdown);
        dayDropdown.click();
        waitElement(dayOption);
        dayOption.click();
    }

    public void selectBirthMonth() {
        waitElement(monthDropdown);
        monthDropdown.click();
        waitElement(monthOption);
        monthOption.click();
    }

    public void selectBirthYear() {
        waitElement(yearDropdown);
        yearDropdown.click();
        waitElement(yearOption);
        yearOption.click();
    }

    public void fillAddress1(String address1) {
        waitElement(address1Field);
        address1Field.sendKeys(address1);
    }

    public void fillAddress2(String address2) {
        waitElement(address2Field);
        address2Field.sendKeys(address2);
    }

    public void fillCity(String city) {
        waitElement(cityField);
        cityField.sendKeys(city);
    }

    public String selectState() {
        waitElement(stateField);
        scrollElement(stateField);
        stateField.click();
        new Actions(Driver.getDriver()).moveToElement(stateOption).perform();
        stateOption.click();
        return stateOption.getText();
    }

    public void fillZipCode(String zipCode) {
        waitElement(zipCodeField);
        zipCodeField.sendKeys(zipCode);
    }

    public String verifyCountry(){
        waitElement(countryOption);
        return countryOption.getText();
    }

    public void fillMobilePhone(String mobilePhone) {
        waitElement(mobilePhoneField);
        mobilePhoneField.sendKeys(mobilePhone);
    }

    public void fillReferenceAddress(String reference) {
        waitElement(referenceAddress);
        referenceAddress.clear();
        referenceAddress.sendKeys(reference);
    }

    public AddressPage registerButtonClick() {
        waitElement(registerButton);
        registerButton.click();
        return new AddressPage();
    }
}
