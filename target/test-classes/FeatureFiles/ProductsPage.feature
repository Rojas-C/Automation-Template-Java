@Products
Feature: Validates Feature page

  Background:
    Given the user visits the login page "https://www.saucedemo.com/" of the application website

  @Products-1
  Scenario: Buying any product
    Given the user is logged in with the user "standard_user"
    When the user clicks to add cart button from any product
    And the user go to cart
    And the user clicks on checkout button
    And the user enter its personal information
    And the user clicks on finish button
    Then the order is processed