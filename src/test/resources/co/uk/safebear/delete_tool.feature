Feature: Deleting a tool


  Rule:
  * A user must be able to delete a tool they have created

  Glossary:
  * Toolslist = a list of tools the user owns


  Scenario: a user deletes a tool
    Given I have created a tool name "selenium"
    When I delete the tool named "selenium"
    Then it no longer appears in my toolslist

