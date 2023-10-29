Feature: Logintest with user data input

  @sprint1
  Scenario: As a tester i open Myfacebook application to
    check user name, password and click login button working
    as expected and i can logged in with my credential


  Scenario: Login test with user input
    Given user will open <Chrome> and <"https://www.facebook.com/">
    When user enter usernames "fvf"
    And user enter passwords "csc"
    And click on logins button
    Then user logg in

  Scenario: Login test with user input
    Given user will open <edge> and <"https://www.facebook.com/">
    When user enter usernames "cdc"
    And user enter passwords "dcc"
    And click on logins button
    Then user logg in
