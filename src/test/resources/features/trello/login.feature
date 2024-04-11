@login @regression @smoke
Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario Outline:
    Given User navigate to "https://trello.com/login"
    Given User login as "<User Name>"
    When User login with password "<Password>"
    Then User should login successfully "<Title>"
    Examples:
      | User Name                   | Password   | Title  |
      | testautomation739@gmail.com | Control123 | Boards |