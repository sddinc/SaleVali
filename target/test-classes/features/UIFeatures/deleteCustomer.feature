Feature: Delete customer

  Scenario: Login SaleVali
    Given Go to salevali homepage "https://dev.salevali.com/auth/login"
    Then User verifies that sign in page header is visible
    And User enters username "test1@gmail.com" and password "Pass2022!"
    And User clicks sign in button
    And User change language as a english

  Scenario Outline: Update Customer
    Given User clicks on the edit icon on the actions
    Then  Verify that update customer is visible successfully
  #And User update  "<CustomerType>" in the customer Type input
    And User update  "<customerName>" in the customer name input
    And User update  "<eMail>" in the email input
    And User update  "<company>" in the company name input
    And User update  "<mobilePhone>" in the mobile number input
    And User update  "<handly>" in the handly number input
    And User update  "<fax>" in the fax input
    And User update  "<taxNumber>" in the tax number input
    And User update  "<vatId>" in the vat ID input
    And User update  "<vatId>" in the vat ID input
    Then User clicks on save button

    Examples:
      |CustomerType|customerName|eMail           |company|mobilePhone  |handly |fax             |taxNumber   |vatId|
      |Privatkunde  |Update C|xyztxyztUpdate0@gmail.com |Update |1|1       |1   |1      |1 |






