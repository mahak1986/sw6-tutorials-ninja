package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {
    @When("user mouse hover on Currency Dropdown and click on it")
    public void userMouseHoverOnCurrencyDropdownAndClickOnIt() {
        new HomePage().mouseHoverOnCurrencyDropDownAndClick();
    }

    @And("User mouse hover on £Pound Sterling and click on it")
    public void userMouseHoverOn£PoundSterlingAndClickOnIt() {
        new HomePage().mouseHoverOnPoundSterlingAndClick();
    }

    @When("User mouse hover on Desktops tab and click on it")
    public void userMouseHoverOnDesktopsTabAndClickOnIt() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("User click on Show All Desktops Option")
    public void userClickOnShowAllDesktopsOption() {
        new HomePage().selectMenuBar("Show AllDesktops");
    }

    @Then("User should See text Desktops on page")
    public void userShouldSeeTextDesktopsOnPage() {
        String expected = "Desktops";
        String actual = new DesktopsPage().verifyDesktopsText();
        Assert.assertEquals(actual,expected,"Error Message");
    }

    @When("User mouse hover on Laptops & Notebooks tab and click on it")
    public void userMouseHoverOnLaptopsNotebooksTabAndClickOnIt() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("User click on Show All Laptops & Notebooks Option")
    public void userClickOnShowAllLaptopsNotebooksOption() {
        new HomePage().selectMenuBar("Show AllLaptops & Notebooks");
    }

    @Then("User should See text Laptops & Notebooks on page")
    public void userShouldSeeTextLaptopsNotebooksOnPage() {
        String expected = "Laptops & Notebooks";
        String actual = new LaptopsAndNoteBooksPage().verifyTheTextLaptopsAndNotebooksOnPage();
        Assert.assertEquals(actual,expected,"Error Message");


    }

    @When("User mouse hover on Components  tab and click on it")
    public void userMouseHoverOnComponentsTabAndClickOnIt() {
        new ComponentsPage().mouseHoverOnComponentsAndClick();
    }

    @And("User click on Show All Components Option")
    public void userClickOnShowAllComponentsOption() {
        new HomePage().selectMenuBar("Show AllComponents");
    }

    @Then("User should See text Components on page")
    public void userShouldSeeTextComponentsOnPage() {
        String expected = "Components";
        String actual = new ComponentsPage().verifyTheTextComponentsOnPage();
        Assert.assertEquals(actual,expected,"Error Message");

    }

    @And("User clicks on Register link")
    public void userClicksOnRegisterLink() {
        new HomePage().selectMyAccountOptions("Register");
    }
}
