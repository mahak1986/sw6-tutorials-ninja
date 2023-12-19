package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductPageTestSteps {

    @And("User enter the Qty require as {string}")
    public void userEnterTheQtyRequireAs(String qty) {
        new ProductPage().enterQuantity(qty);

    }


    @And("User verifies text for product")
    public void userVerifiesTextForProduct(String order) {
        Assert.assertEquals(new ProductPage().getProductText(),order,"Error Message");
    }

    @And("User click on Add to cart button")
    public void userClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();

    }

    @Then("User should able to verify the message {string}")
    public void userShouldAbleToVerifyTheMessage(String order) {
        Assert.assertEquals(new ProductPage().getProductAddedSuccessMessage(),order,"Error Message");

    }

    @And("user click on Link Shopping Cart display into success message")
    public void userClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();

    }

    @Then("USer should able to verify the text {string}")
    public void userShouldAbleToVerifyTheText(String order) {
        Assert.assertEquals(new ShoppingCartPage().getShoppingCartText(),order,"Error Message");
    }
}
