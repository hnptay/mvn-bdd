@FacebookTest
Feature: Verify Facebook login page

  @displayed
  Scenario: Verify login page
    #Given Open Facebook application
    Then Verify email textbox is displayed
    And Verify password textbox is displayed


  @para_mark
  Scenario: Login with parameter
    #Given Open Facebook application
    When Input to UserID "banana"
    And Input to Password "123456"


  @multiple_para
  Scenario: Login with parameter
    #Given Open Facebook application
    When Input to UserID "banana" and Password "123456"


  @datatable_step
  Scenario Outline: Create new customer with email <Email>
    #Given Open Facebook application
    When Input to UserID and Password
      | UserID   | Password   |
      | <UserID> | <Password> |


    Examples:
      | UserID | Password | Email              |
      | banana | 123456   | banana@hotmail.com |

  @multiple_row
  Scenario Outline: Create new customer with email <Email>
    #Given Open Facebook application
    When Input to multiple UserID and Password
      | UserID   | Password   |
      | <UserID> | <Password> |


    Examples:
      | UserID | Password | Email              |
      | banana | 123456   | banana@hotmail.com |
      | candy  | 123456   | candy@hotmail.com  |
      | apple  | 123456   | apple@hotmail.com  |