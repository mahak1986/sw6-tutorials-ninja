Feature: Register Page Test Feature

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it

#4. myaccountstest.feature and write following scenarios
#1. verifyUserShouldNavigateToRegisterPageSuccessfully
#1.1 Clickr on My Account Link.
#1.2 Call the method “selectMyAccountOptions” method and pass the parameter
#“Register”
#1.3 Verify the text “Register Account”

  @Mahak @smoke @sanity @regression
  Scenario: User to navigate to register page successfully
    When User clicks on my account link
    And  User clicks on Register link
    Then User verify "Register Account" text

 #2. verifyUserShouldNavigateToLoginPageSuccessfully
 #2.1 Clickr on My Account Link.
 #2.2 Call the method “selectMyAccountOptions” method and pass the parameter
 #“Login”
 #2.3 Verify the text “Returning Customer”.

  @Mahak @smoke @regression
  Scenario: User to navigate to login page successfully
    When User clicks on my account link
    And  User clicks on login link
    Then User verify "“Returning Customer" text

    #3. verifyThatUserRegisterAccountSuccessfully
    #3.1 Click on My Account Link.
    #3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
    #3.3 Enter First Name
    #3.4 Enter Last Name
    #3.5 Enter Email
    #3.6 Enter Telephone
    #3.7 Enter Password
    #3.8 Enter Password Confirm
    #3.9 Select Subscribe Yes radio button
    #3.10 Click on Privacy Policy check box
    #3.11 Click on Continue button
    #3.12 Verify the message “Your Account Has Been Created!”
    #3.13 Click on Continue button
    #3.14 Click on My Account Link.
    #3.15 Call the method “selectMyAccountOptions” method and pass the parameter
    #“Logout”
    #3.16 Verify the text “Account Logout”
    #3.17 Click on Continue button

  @Mahak @regression
  Scenario: User should register his account successfully
    When User clicks on my account link
    And  User clicks on Register link
    And  User enters first name
    And  User enters last name
    And  User enters an Email
    And  User enters telephone number
    And  User enters password
    And  User enters confirm password
    And  User selects subscribe yes radio button
    And  User checks on privacy policy checkbox
    And  User clicks on continue button
    Then User verify “Your Account Has Been Created!”
    Then User clicks on continue buttonOne
    Then User clicks on my account link
    And  User clicks on logout button
    Then User verify “Account Logout” text
    Then User click on continue buttonTwo







