@customer
Feature: Register and Login
  @register_login
  Scenario: Register and log in to system
    Given Get login page url
    And Open register page
    When Input to email textbox
    And Click to submit button
    And Get user and password info
    And Back to login page
    Then Login to system
    And Verify login success

  @new_customer
  Scenario Outline: Add new customer
    Given Open "New Customer" page menu
    When Input to "Customer Name" textbox with value "<CustomerName>"
    And Select Gender by select "m" radio button
    And Select "Date of Birth" with value "<DobIn>"
    And Input to "addr" textarea with value "<Address>"
    And Input to "City" textbox with value "<City>"
    And Input to "State" textbox with value "<State>"
    And Input to "PIN" textbox with value "<Pin>"
    And Input to "Mobile Number" textbox with value "<Mobile>"
    And Input to "E-mail" textbox with value "Email"
    And Input to "Password" textbox with value "Password"
    And Click to "submit" button
    Then Verify success message "Customer Registered Successfully!!!" displayed
    And Get "Customer ID" in the textbox
    And The valid value displayed at "Customer Name" with "<CustomerName>"
    And The valid value displayed at "Gender" with "<Gender>"
    And The valid value displayed at "Birthdate" with "<DobOut>"
    And The valid value displayed at "Address" with "<Address>"
    And The valid value displayed at "City" with "<City>"
    And The valid value displayed at "State" with "<State>"
    And The valid value displayed at "Pin" with "<Pin>"
    And The valid value displayed at "Mobile No." with "<Mobile>"
    And The valid value displayed at "Email" with "<Email>"

    Examples:
      | CustomerName | Gender | DobIn      | DobOut     | Address | City      | State  | Pin    | Mobile     |
      | Cris Ngu     | male   | 03/03/1999 | 1999-03-03 | 3003    | Barcelona | Alaska | 123456 | 0979123345 |