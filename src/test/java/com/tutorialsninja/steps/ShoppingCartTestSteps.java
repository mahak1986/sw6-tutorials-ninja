package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ShoppingCartTestSteps {
    @Then("User should able to verify the product name {string}")
    public void userShouldAbleToVerifyTheProductName(String productName) {
        Assert.assertEquals(new ShoppingCartPage().getProductName(),productName,"Error Message");
    }

    @Then("User should able to verify the Model {string}")
    public void userShouldAbleToVerifyTheModel(String model) {
        Assert.assertEquals(new ShoppingCartPage().getModel(),model,"Error Message");
    }

    @Then("User should able to verify the Total {string}")
    public void userShouldAbleToVerifyTheTotal(String price) {
        Assert.assertEquals(new ShoppingCartPage().getTotal(),price,"Error Message");
    }

    @Then("User should able to see {string}")
    public void userShouldAbleToSee(String shoppingCartText1) {
        Assert.assertEquals(new ShoppingCartPage().verifyShoppingCartText1(),shoppingCartText1,"Error Message");
    }

    @And("user should able to see Product name is {string}")
    public void userShouldAbleToSeeProductNameIs(String macBookText) {
        Assert.assertEquals(new ShoppingCartPage().verifyMacBookText(),macBookText,"Error Message");

    }

    @And("User Change Quantity to {int}")
    public void userChangeQuantityTo(String qty) {
        new ProductPage().enterQuantity("2");
    }

    @And("User click on Update tab")
    public void userClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateMacBookCart();
    }

    @Then("User should see message {string}")
    public void userShouldSeeMessage(String updatedMessage) {
        Assert.assertEquals(new ShoppingCartPage().getSuccessModifiedMessage(),updatedMessage,"Error Message");
    }


    @And("user click on Checkout button")
    public void userClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @Then("User should see text Checkout")
    public void userShouldSeeTextCheckout() {
        String expected = "Checkout";
        String actual =  new ShoppingCartPage().verifyCheckOutText();
        Assert.assertEquals(actual,expected,"Error message");
    }

    @And("User click on Guest Checkout radio button")
    public void userClickOnGuestCheckoutRadioButton() {
        new ShoppingCartPage().clickOnGuestCheckoutRadioButton();

    }

    @And("user should see text {string}")
    public void userShouldSeeText(String newCustomerText) {
        Assert.assertEquals(new ShoppingCartPage().VerifyNewCustomerText(),newCustomerText,"Error Message");
    }


    @And("User click on Continue tab")
    public void userClickOnContinueTab() {
        new ShoppingCartPage().clickOnContinueTabOnCheckOutPage();
    }

    @Then("user fill all the mandatory fields")
    public void userFillAllTheMandatoryFields() {
        new ShoppingCartPage().enterFirstName("Mahak");
        new ShoppingCartPage().enterlastName("Agarwal");
        new ShoppingCartPage().enterEmail("mahakagg@gmail.com");
        new ShoppingCartPage().enterPhoneNumber("07934567895");
        new ShoppingCartPage().enterAddress("10 Downing Street");
        new ShoppingCartPage().enterCity("Tokyo");
        new ShoppingCartPage().enterPostcode("WD1 2CD");
        //new ShoppingCartPage().enterCountry("222");
        new ShoppingCartPage().inputState();
        new ShoppingCartPage().enterRegion("Aberdeen");

    }

    @And("User click on Continue")
    public void userClickOnContinue() {
        new ShoppingCartPage().clickOnContinueTabOnCheckOutPage1();

    }

    @And("User enter Comments about order into text field")
    public void userEnterCommentsAboutOrderIntoTextField() {
        new ShoppingCartPage().addCommentsOnCheckOutPage("Successful");
    }

    @And("User Click on check the Terms & Conditions check box")
    public void userClickOnCheckTheTermsConditionsCheckBox() {
        new ShoppingCartPage().clickOnTermsAndConditions();
    }

    @And("User Click on Continues")
    public void userClickOnContinues() {
        new ShoppingCartPage().clickOnContinueButtonPostCommentButton();
    }
}
