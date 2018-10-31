package com.pucrs.thiagoroly.test;

import com.pucrs.thiagoroly.steps.*;
import org.junit.Test;

import java.util.Random;

public class PurchaseWithNewRegistrationTest {

    private HomePageSteps homepageSteps;
    private ProductPageSteps productPageSteps;
    private CartPageSteps cartPageSteps;
    private SignInUpPageSteps signInUpPageSteps;
    private AddressPageSteps addressPageSteps;
    private PaymentPageSteps paymentPageSteps;
    private ShippingPageSteps shippingPageSteps;

    private String email, firstName, lastName, password, address1, address2, city, zipCode, mobilePhone,
            reference;

    @Test
    public void runTest(){
        initiateVariables();

        homepageSteps = new HomePageSteps();
        //1. Acessar o site: www.automationpractice.com
        homepageSteps.accessHomePage();
        //2. Escolha um produto qualquer na loja
        productPageSteps = new ProductPageSteps(homepageSteps.selectFirstProduct());
        //3. Adicione o produto escolhido ao carrinho
        productPageSteps.addProductToCart();
        //4. Prossiga para o checkout
        cartPageSteps = new CartPageSteps(productPageSteps.proceedToCheckout());
        //5. Valide se o produto foi corretamente adicionado ao carrinho e prossiga caso esteja tudo certo
        cartPageSteps.validateProductAdded();
        signInUpPageSteps = new SignInUpPageSteps(cartPageSteps.proceedToCheckoutLogin());
        //6. Realize o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários
        signInUpPageSteps.createAnAccount(email); signInUpPageSteps.fillForm(firstName,lastName, password, address1,
                address2, city, zipCode, mobilePhone, reference);
        addressPageSteps = new AddressPageSteps(signInUpPageSteps.finishAccountCreation());
        //7. Valide se o endereço está correto e prossiga
        addressPageSteps.verifyName(firstName + " " + lastName);
        addressPageSteps.verifyFullAddress(address1 + " " + address2);
        addressPageSteps.verifyCityStateZipCode(city + ", " + signInUpPageSteps.getState() + " " +zipCode);
        addressPageSteps.verifyCountry(signInUpPageSteps.getCountry());
        addressPageSteps.verifyMobilePhone(mobilePhone);
        shippingPageSteps = new ShippingPageSteps(addressPageSteps.proceedToShipping());
        //8. Aceite os termos de serviço e prossiga
        shippingPageSteps.agreeTermsOfService();
        paymentPageSteps = new PaymentPageSteps(shippingPageSteps.proceedToPayment());
        //9. Valide o valor total da compra
        paymentPageSteps.verifyTotalPrice(cartPageSteps.verifyTotalPrice());
        //10. Selecione um método de pagamento e prossiga
        paymentPageSteps.selectBankwirePayment();
        //11. Confirme a compra e valide se foi finalizada com sucesso
        paymentPageSteps.confirmOrder();
        paymentPageSteps.validateSuccessfulOrder();
    }

    private void initiateVariables(){
        Random rand = new Random();
        email = "fake.user" + rand.nextInt(100) + 1 + "@email.com";
        firstName = "User";
        lastName = "Fake";
        password = "12345678";
        address1 =  "Some Place";
        address2 = "Apt 101";
        city = "Some City";
        zipCode = "80008";
        mobilePhone = "1100987654321";
        reference = "Home";
    }

}
