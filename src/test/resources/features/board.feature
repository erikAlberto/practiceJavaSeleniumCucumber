Feature: board trello
  Verify if user is able to use features on board page

  Background:
    Scenario Outline:
      Given User navigate to "https://trello.com/login"
      Given User login as "<User Name>"
      When User login with password "<Password>"
      Then User should login successfully "<Title>"
      Examples:
        | User Name                   | Password   | Title  |
        | testautomation739@gmail.com | Control123 | Boards |

    Scenario: Create a new Board
      Given The user is on home page
      When The user creates the "auto2" board
      Then The user see "auto2" on "Board" page

  Scenario: Create a new card in the board
    Given The user is on the board page
    When The user create a new card "create DB"
    Then The user see "create DB" on "List" page

  Scenario: Remove Board
    Given The user is on the board page
    When The user delete the board
    Then The user verify that was deleted