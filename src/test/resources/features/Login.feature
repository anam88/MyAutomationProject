Feature: Login feature
  As user I want to login because otherwise how do I use this app?

  Scenario: Basic Login
    Given User is on the landing page
    When user enter credentials
    And user clicks login button
    Then user suppose to see Welcome message
