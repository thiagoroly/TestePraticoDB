package com.pucrs.thiagoroly.setup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver;
    private static final int TIMEOUT = 15;

    public static WebDriver getDriver() {
        if (driver == null){
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void waitElement(WebElement element){
        new WebDriverWait(getDriver(), TIMEOUT).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void scrollElement(WebElement element){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
