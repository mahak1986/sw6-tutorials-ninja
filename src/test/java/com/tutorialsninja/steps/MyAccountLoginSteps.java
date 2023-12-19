package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountLoginPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountLoginSteps {
    @When("User clicks on my account link")
    public void userClicksOnMyAccountLink() {
        new HomePage().clickOnMyQAccountTab();
    }

    @And("User clicks on login link")
    public void userClicksOnLoginLink() {
        new HomePage().selectMyAccountOptions("Login");
    }

    @And("User enters Email address")
    public void userEntersEmailAddress() {
        new AccountLoginPage().enterEmailAddress("mahak1234@gmail.com");
    }

    @And("User enters password")
    public void userEntersPassword() {
        new AccountLoginPage().enterPassword("Mahak123");

    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        new AccountLoginPage().clickOnLoginButton();
    }


    @And("User click on logout link")
    public void userClickOnLogoutLink() {
        new HomePage().selectMyAccountOptions("MyAccount");
        new HomePage().selectMyAccountOptions("Logout");
    }

    @Then("User verify “Account Logout” text")
    public void userVerifyAccountLogoutText() {
      String expected = "Account Logout";
      String actual = new MyAccountPage().getAccountLogoutText();
        Assert.assertEquals(actual,expected,"Error Message");

    }

    @And("User clicks on continue buttonthree")
    public void userClicksOnContinueButtonthree() {
        new MyAccountPage().clickOnContinueButton();
    }
}
