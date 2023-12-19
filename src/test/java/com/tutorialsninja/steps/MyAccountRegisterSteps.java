package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountRegisterPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyAccountRegisterSteps {
    @Then("User verify {string} text")
    public void userVerifyText(String arg0) {
        String expected = "Register Account";
        String actual = new AccountRegisterPage().getRegisterAccountText();
        Assert.assertEquals(actual,expected,"Error Message");

    }

    @And("User enters first name")
    public void userEntersFirstName() {
        new AccountRegisterPage().enterFirstName("Mahak");

    }

    @And("User enters last name")
    public void userEntersLastName() {
        new AccountRegisterPage().enterLastName("Agarwal");
    }

    @And("User enters telephone number")
    public void userEntersTelephoneNumber() {
        new AccountRegisterPage().enterTelephone("07954609865");

    }

    @And("User enters confirm password")
    public void userEntersConfirmPassword(){
        new AccountRegisterPage().enterConfirmPassword("Mahak123");
    }
    @And("User selects subscribe yes radio button")
    public void userSelectsSubscribeYesRadioButton() {
        new AccountRegisterPage().subscribeYesRadioButton();
    }

//    @And("User selects subscribe {string} radio button")
//    public void userSelectsSubscribeRadioButton() {
//        new AccountRegisterPage().subscribeYesRadioButton();
//    }

    @And("User checks on privacy policy checkbox")
    public void userChecksOnPrivacyPolicyCheckbox() {
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();

    }

    @And("User clicks on continue button")
    public void userClicksOnContinueButton() {
        new AccountRegisterPage().clickOnContinueButton();
    }

    @Then("User verify “Your Account Has Been Created!”")
    public void userVerifyYourAccountHasBeenCreated() {
        String expected = "Your Account Has Been Created!";
        String actual = new MyAccountPage().getYourAccountHasBeenCreatedText();
        Assert.assertEquals(actual,expected,"Error Message");
    }

    @Then("User clicks on continue buttonOne")
    public void userClicksOnContinueButtonOne() {
        new MyAccountPage().clickOnContinueButton();
    }

    @And("User clicks on logout button")
    public void userClicksOnLogoutButton() {
        new HomePage().selectMenuBar("Logout");
    }

    @Then("User click on continue buttonTwo")
    public void userClickOnContinueButtonTwo() {
        new AccountRegisterPage().clickOnContinueOnLastPage();

    }

    @And("User enters an Email")
    public void userEntersAnEmail() {
        final String randomEmail;
        randomEmail = AccountRegisterPage.randomEmail();
        new AccountRegisterPage().enterEmail(randomEmail);
        //new AccountRegisterPage().enterEmail("robert_jackson@gmail.com");
}


    }


