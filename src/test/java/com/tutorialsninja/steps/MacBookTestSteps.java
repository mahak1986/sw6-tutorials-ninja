package com.tutorialsninja.steps;

import com.tutorialsninja.pages.MacBookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MacBookTestSteps {
    @And("User Select Product MacBook")
    public void userSelectProductMacBook() {
        new MacBookPage().clickOnMacBook();
    }
    

    @Then("User should able to verify the Product name MacBook")
    public void userShouldAbleToVerifyTheProductNameMacBook(String product) {
        Assert.assertEquals(new MacBookPage().verifyMacBookText(), "MacBook", "MacBook Product not display");
    }

    @And("User Click on Add To Cart button")
    public void userClickOnAddToCartButton() {
        new MacBookPage().addToCartButton();

    }

    @Then("User should see the message {string}")
    public void userShouldSeeTheMessage(String successMessage) {
        Assert.assertTrue(new MacBookPage().getProductAddedSuccessMessage().contains("Success: You have added MacBook to your shopping cart!"),
                "Product not added to cart");
        //Assert.assertEquals(new MacBookPage().getProductAddedSuccessMessage(),successMessage,"Error Message");
    }

    @And("User click on link shopping cart display into success message")
    public void userClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new MacBookPage().clickOnShoppingCart();

    }
}
