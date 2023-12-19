package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopsPageTestSteps {
    @And("User click on sort By Position Name: Z to A")
    public void userClickOnSortByPositionNameZToA() {
        new DesktopsPage().sortingDesktopsFromZtoA("Name (Z - A)");


    }
    //Check if creating problems. remove it
    @Then("User should see products are arranged in Descending order")
    public void userShouldSeeProductsAreArrangedInDescendingOrder(String order) {
        Assert.assertEquals(new DesktopsPage().getProductsNameList(),order,"Error Message");
    }

    @And("User click on sort By Position Name: A to Z")
    public void userClickOnSortByPositionNameAToZ() {
        new DesktopsPage().sortingDesktopsFromAtoZ("Name: A to Z");
    }

    @And("User select the product {string}")
    public void userSelectTheProduct(String product) {
        new DesktopsPage().selectProductsOption(product);
    }
}
