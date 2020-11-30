Feature: Checking some functionality of 365 Portal page

  @test3
  Scenario: Verifying functionality of 365 Portal of the NAU homepage.
    Given user will navigates to the website
    When  user clicks on 365 Portal
    Then a page will navigate to "https://www.office.com/?auth=2"
    And the page will open


