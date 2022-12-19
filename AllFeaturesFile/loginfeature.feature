Feature: Test Facebook Application

  Scenario: Test Facebook Register functionality
    Given user is on register page
    When user enter valid firstname and lastname and username and password and DOB
    Then user click on Sign up button
