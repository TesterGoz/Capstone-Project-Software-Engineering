Feature: User will see drop-down menu at the NAU Home Page, under the NAU Logo
  @Test4
  Scenario: Search for Admissions Life drop-down menu
    Given User will navigate to the NAU website
    When User hovers on Admissions
    Then Three sections on Undergraduate, Graduate, Gulf Language School are displayed

  @Test4
  Scenario: Search for Academics drop-down menu
    Given User will navigate to the NAU website
    When User hovers on Academics
    Then Three sections on Academic Resources are displayed

  @Test4
  Scenario: Search for Faculty & Staff drop-down menu
    Given User will navigate to the NAU website
    When User hovers on Faculty & Staff
    Then Sections on Employee Center and News and Events are displayed

  @Test4
  Scenario: Search for Campus Life drop-down menu
    Given User will navigate to the NAU website
    When User hovers on Campus Life button on menu
    Then Three sections on Student Services, Residential Life and Parking & Security are displayed on screen

  @Test4
  Scenario: Search for Students drop-down menu
    Given User will navigate to the NAU website
    When User hovers on Students
    Then Information on Offices will be displayed

  @Test4
  Scenario: Search for About NAU drop-down menu
    Given User will navigate to the NAU website
    When User hovers on About NAU
    Then Three sections on Mission Statement, Office of the President and Details are displayed

  @Test4
  Scenario: CampusLife menu button
    Given User navigates to the main page
    When User hovers over on Campus Life button on menu
    Then The Button color changes then
    And Button becomes clickable

  @Test4
  Scenario: Search for Campus Life drop-down menu
    Given User will navigate to the NAU website
    When User clicks on Campus Life
    Then User hovers on Housing
    Then User hovers on Service Request
    Then User hovers on Campus Security
    Then User hovers on Emergency Guide
    Then User hovers on Parking & Transportation
    Then  User hovers on Dining at NAU
    Then User hovers on Calendar of Events
    Then User hovers on Student Organizations
    Then User hovers on Health Services
    Then User hovers on Student Services

  @Test4
  Scenario: Sending keys on search field
    Given user go to home page
    When user clicks on Search Button
    Then user sends keys

  @Test4
  Scenario: Go to Student Organizations page
    Given user go to home page
    When user click the Student Organizations
    Then Student Organizations Page will be displayed

  @Test4
  Scenario: Request Info
    Given User clicks on Request Info
    When Info appears
    Then User sees detailed information

