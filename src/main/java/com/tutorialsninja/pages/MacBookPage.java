package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MacBookPage extends Utility {

@CacheLookup
@FindBy(xpath = "//a[text()='MacBook']")
WebElement clickOnMacBook;

@CacheLookup
@FindBy(xpath = "//h1[normalize-space()='MacBook']")
WebElement verifyMacBookText;

@CacheLookup
@FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;

@CacheLookup
@FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
WebElement verifySuccessMessage;

@CacheLookup
@FindBy(xpath = "//a[contains(text(),'shopping cart')]")
        WebElement clickOnShoppingCartMessageLink;



    public void clickOnMacBook(){
      clickOnElement(clickOnMacBook);
        }

    public String verifyMacBookText() {
        return getTextFromElement(verifyMacBookText);

    }
    public void addToCartButton(){
        clickOnElement(addToCartButton);
    }
    public String getProductAddedSuccessMessage() {
        return getTextFromElement(verifySuccessMessage);
    }

    public void clickOnShoppingCart(){
        clickOnElement(clickOnShoppingCartMessageLink);
    }
}
