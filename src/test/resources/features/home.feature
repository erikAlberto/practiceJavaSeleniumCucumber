Feature: Dashboard trello
  Verify if user is able to use features on Dashboard page

  Scenario: Create a new Board
    Given The user is on home page
    When The user creates the "auto2" board
    Then The user see "auto2" on "Board" page
