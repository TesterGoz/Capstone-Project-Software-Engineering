Feature: NAU Academics Page

  Scenario: User will see the Menu when hovering over Academics
    Given User will go to home page
    When Moving mouse over Academics
    Then Menu will be displayed


  Scenario: Academics link will change color when mouse move over
    Given user go to home page
    When move mouse over Academics
    Then color will change


  Scenario: Go to academics page
    Given user go to home page
    When user click the Academics
    Then Academics page will be displayed


  Scenario Outline: Test left column links on Academic Page
    Given user go to academics page
    When user click the "<Menu Link>"
    Then corresponding "<Menu Link>" page will be displayed
    Examples:
      |Menu Link|
      |Academics|
      |CourseSchedule|
      |FinalsSchedule|
      |DegreePrograms|
      |CalendarOfEvents|
      |DistanceEducation|
      |AcademicCatalog|
      |FacultyMembers|
      |AcademicCalendar|
      |AcademicClubs|
      |CourseDescription|

  @test
  Scenario Outline: Test Quick Links  on Academic Page
    Given user go to academics page
    When user click the "<Quick Links>" under Quick Links
    Then corresponding Quick Links "<Quick Links>" page will be displayed
    Examples:
      |Quick Links|
      |NAULibrary|
      |myNAULogin|
      |NAUmoodleLogin|
      |NAUEmailLogin|
      |NAUBrochures|
      |GulfLanguageSchool|
