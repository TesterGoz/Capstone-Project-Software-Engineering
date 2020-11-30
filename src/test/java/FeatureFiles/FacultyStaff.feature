Feature: Checking Faculty&Staff page functionality

@test4
  Scenario: Verifying Faculty&Staff menu button
    Given User navigates to the main page
    When User hover over on Faculty&Staff button on menu
    Then Button color changes
    And Button is clickable

  @test4
  Scenario: Verifying Faculty&Staff dropdown menu
    Given User navigates to the main page
    When User hover over Faculty&Staff button on menu
    Then Dropdown menu is visible

  @test4
  Scenario: Verifying Faculty&Staff menu link
    Given User navigates to the main page
    When User clicks Faculty&Staff button on menu
    Then User navigates to respective page
