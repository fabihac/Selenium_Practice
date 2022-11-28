Feature: Automation Demo Site login

  Background:
    Given User launch Browser
    When User opens URL "https://demo.automationtesting.in/Register.html"
  @sanity
  Scenario: Successful Login with valid credentials
    And User enters FirstName as "Fabiha" and LastName as "Chowdhury"
    And User clicks on Submit button
    Then Page will show alert
    And close browser
  @regression
  Scenario Outline: Login Data Driven
      And User enters FirstName as "<FirstName>" and LastName as "<LastName>"
      And User clicks on Submit button
      Then Page will show alert
      And close browser
      Examples:
        | FirstName |LastName|
        |  Marzan   |Chowdhury|
       |  Raisa    |Chowdhury|