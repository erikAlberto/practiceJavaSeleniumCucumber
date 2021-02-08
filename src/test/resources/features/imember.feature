Feature: Member trello board
  Verify if user is able to use features on member page

  Scenario: Add Member to the new team
    Given The user is on member page
    When The user add to "erikalberto8492@gmail.com"new team member
    Then The user see "Alb3rt03rik" on "Member" page

  Scenario: Remove team member for the Team group
    Given The user is on member page
    When The user remove team member
    Then The user see "Invite Your Team" on "Member" page
