@Login
Feature: Passenger APP.

  Scenario: Log in Passenger App USing Phone Number
    Given I launch the Passenger App
    When I tap on continue with mobile Number
    Then I see a screen to Register/logIn
    And Enter the mobile number "787764974"
    When I tap the Continue button
    And proceed to the next screen
    Then I wait for the Verification code
    When I tap Verify Button
    Then User successfully logs in