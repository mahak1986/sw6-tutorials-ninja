Feature: Account Login Page Test Feature

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it

    #. verifyThatUserShouldLoginAndLogoutSuccessfully
    #4.1 Click on My Account Link.
    #4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
    #4.3 Enter Email address
    #4.5 Enter Password
    #4.6 Click on Login button
    #4.7 Verify text “My Account”
    #4.8 Click on My Account Link.
    #4.9 Call the method “selectMyAccountOptions” method and pass the parameter
    #“Logout”
    #4.10 Verify the text “Account Logout”
    #4.11 Click on Continue button
@Mahak @sanity @smoke @regression
  Scenario: User should login and logout successfully
    When User clicks on my account link
    And  User clicks on login link
    And  User enters Email address
    And  User enters password
    And  User clicks on login button
    And  User click on logout link
    Then User verify “Account Logout” text
    And User clicks on continue buttonthree



