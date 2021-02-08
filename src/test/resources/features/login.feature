Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Successful log out form application
    Given User navigate to "https://trello.com/auto1103/home"
    When User logs out on the page
    Then Message displayed Logout successfully