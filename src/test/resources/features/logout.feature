@login @regression @smoke
Feature: Logout Feature
  Verify if user is able to Logout of the application

  Scenario: Successful log out form application
    Given User navigate to "https://trello.com/u/test61286078/boards"
    When User logs out on the page
    Then Message displayed Logout successfully