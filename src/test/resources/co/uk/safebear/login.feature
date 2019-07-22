Feature: Login
  In order to access the website
  As a user
  I want to know if my login is successful

  Rules:
  * The User must be informed if the login information is incorrect
  * The User must be informed if the login is successful

  Glossary:
  * User: someone who wants to create a list of Tools
  * Supporters: This is what the customer calls 'Admin' users

  Background: logout
    Given I am logged out

  @high-impact
  Scenario Outline: a valid user logs into the application
    # Given I am logged out
    When I enter username "<username>" and password "<password>"
    Then the user is informed that the login is successful
    Examples:
    |username|password|
    |tester  |letmein |
    |tester1 |letmein |
    |tester2 |letmein |

  @to-do
  Scenario: an invalid user attempts to login
    # Given I am logged out
    When I enter username "attacker" and password "dontletmein"
    Then I am informed that the login is unsuccessful





