package com.pucrs.thiagoroly.pages;

import com.pucrs.thiagoroly.setup.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

import static com.pucrs.thiagoroly.setup.Driver.scrollElement;
import static com.pucrs.thiagoroly.setup.Driver.waitElement;

public class HomePage {

    @FindBy(how = How.ID, using = "homefeatured")
    protected WebElement featuredProducts;

    @FindBy(how = How.XPATH, using = "//div[@class='product-container']")
    protected WebElement firstProduct;

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void accessHomePage(){
        Driver.getDriver().navigate().to("http://automationpractice.com/index.php");
        waitElement(featuredProducts);
    }

    public ProductPage firstProductClick() {
        waitElement(firstProduct);
        scrollElement(firstProduct);
        new Actions(Driver.getDriver()).moveToElement(firstProduct).perform();
        firstProduct.click();
        return new ProductPage();
    }

}
