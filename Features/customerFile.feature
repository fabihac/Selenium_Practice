Feature: Customers
  Scenario: Add new Customer
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters FirstName as "admin@yourstore.com" and LastName as "admin"
    And User clicks on Login button
    Then user can view dashboard
    When User clicks on customer menu
    And click on customers menu item
    And click on add new customer
    Then User can view Add new customer Page
    When User enter customer info
    And click on save button
    Then user can view confirmation massage"The new customer has been added successfully"
    And close browser