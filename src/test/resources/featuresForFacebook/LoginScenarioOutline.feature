@scenarioOutline
Feature: login feature with outline

  Scenario: As a tester i want to open my afacebook application
    to enter valid user name,password and click login buttton for multiple users
    so that i can logged in with credential

  Scenario Outline: Title of your scenario outline
    Given user can enter <browser> and <Url>to open app
    When user enter <userName> and <password>for input field
    And user click login button
    Then user can close app

    Examples: 
      | browser  | Url                         | userName | password |
      | "Chrome" | "https://www.facebook.com/" | "gcbgb"  | "hgnvbn" |
      | "edge"   | "https://www.facebook.com/" | "dsc"    | "csdc"   |
