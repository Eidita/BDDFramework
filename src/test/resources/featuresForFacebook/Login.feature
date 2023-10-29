@common
Feature: Valid loginTest

  @sprint1 @smoke @regression
  Scenario: As a tester i open facebook application to
    check user name, password and click login button working
    as expected

    Given User open facebook application
    When enter my valid userName
    And enter my valid pass
    And hit login button
    Then I can be logged in
