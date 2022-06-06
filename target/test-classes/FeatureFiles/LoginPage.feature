@Login
Feature: Validate Login page

  @Login-1
  Scenario: Validate successful login using the Standard User
    Given the user visits the login page "https://www.saucedemo.com/" of the application website
    When the user add the user name "standard_user"
    And the user add the password "secret_sauce"
    And the user press Login button
    Then the user can accessing to the products page

  @Login-2
  Scenario: Validate Unsuccessful login using the Standard User
    Given the user visits the login page "https://www.saucedemo.com/" of the application website
    When the user add the user name "standard_user"
    And the user add the password "incorrect_pass"
    And the user press Login button
    Then a error message is shown

  @Login-3
  Scenario: using BDD tables to run scenarios in another way
    Given the user visits the login page "https://www.saucedemo.com/" of the application website
    When the user enter the following for login
      | Username      | Password     |
      | standard_user | secret_sauce |
    And the user press Login button
    Then the user can accessing to the products page

  @Login-4
  Scenario Outline: using scenario outline
    Given the user visits the login page "https://www.saucedemo.com/" of the application website
    When the user enter the <Username> and <Password>
    And the user press Login button
    Then the user can accessing to the products page

    Examples:
      | Username               | Password     |
      | standard_user          | secret_sauce |
      | locked_out_user        | secret_sauce |
      | problem_user           | secret_sauce |
      |performance_glitch_user | secret_sauce |

    @Login-5
    Scenario Outline: Successful Login with Valid Credentials
      Given the user visits the login page "https://www.saucedemo.com/" of the application website
      When User enters mandatory details of "<TestCase>"
      And the user press Login button
      Then the user can accessing to the products page
      Examples:
        |TestCase|
        |Case1   |
        |Case2   |
        |Case3   |