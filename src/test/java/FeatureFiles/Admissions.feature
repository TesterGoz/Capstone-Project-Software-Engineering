Feature: Checking some functionality of Admissions page

  @test2
  Scenario: Verifying functionality of APPLY NOW from drop down menu of Admissions.
    Given user navigates to the website
    When  user clicks on APPLY NOW
    Then the page will navigate to "https://apply.na.edu/admission"
    And the page will appear


  @test2
  Scenario: Verifying functionality of APPLY NOW page for APPLY NAU button
    Given user navigates to the website
    When user mouse over on APPLY NAU
    Then  APPLY NAU should be underlined