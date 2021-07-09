#Actor: Miguel
@stories
Feature: uTest
  @scenario1
  Scenario: Sign up for utest
    Given miguel registered personal data
    |strFirtName| |strLastName| |     strEmail       | |strBirthMonth| |strBirthDay| |strBirthYear|
    |  <Miguel> | |  <Henao>  | |<mghenao95@gmail.es>| | <Setember>   | |   <30>    | |   <1995>   |
    Then I register the Location

    Then I register the devices

    When I click to confirm
    |strPassword| |strConfirmPassword|
    |   <123>   | |    <123>         |