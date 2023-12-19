package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

public class AccountRegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement passwordConfirmField;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement subscribeYesRadioButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicyCheckBox;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueBtn;
    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement clickOnContinueOnLastPage;




    public String getRegisterAccountText() {
        log.info("Get Register account text : " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstNameField, fName);
        log.info("Enter first name : " + firstNameField.toString());
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastNameField, lName);
        log.info("Enter last name : " + lastNameField.toString());
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
        log.info("Enter phone number : " + telephoneField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password : " + passwordField.toString());
    }

    final String randomEmail = randomEmail();

    public void enterEmail(String emailAddress) {
        sendTextToElement(email, emailAddress);
        log.info("Enter email : " + email.toString());
    }

    public static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
}
    public void enterConfirmPassword(String cPassword) {
        sendTextToElement(passwordConfirmField, cPassword);
        log.info("Enter confirm password : " + passwordConfirmField.toString());
    }


    public void subscribeYesRadioButton(){
        clickOnElement(subscribeYesRadioButton);
        log.info("Click on Subscribe radio button : " + subscribeYesRadioButton.toString());
    }

    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyPolicyCheckBox);
        log.info("Check on privacy policy checkbox : " + privacyPolicyCheckBox.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        log.info("Click on continue button : " + continueBtn.toString());
    }
    public void clickOnContinueOnLastPage() {
        clickOnElement(clickOnContinueOnLastPage);
        log.info("Click on continue button on last page : " + clickOnContinueOnLastPage.toString());
    }

}

