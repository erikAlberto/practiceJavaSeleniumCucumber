Feature: Login Feature
  Verify if user is able to Login in to the site

  Background:
    Given I navigate to Login page
  Scenario Outline: Login as a authenticated user
    When I login as "<User Name>"
     And I login with password "<Password>"
    Then I should login successfully "<Title>"

    Examples: Short pass
      | User Name                   | Password   | Title  |
      | testautomation739@gmail.com | Control123 | Boards |
