Feature: Create new customer

  Scenario: Login SaleVali
    Given Go to salevali homepage "https://dev.salevali.com/auth/login"
    Then User verifies that sign in page header is visible
    And User enters username "test1@gmail.com" and password "Pass2022!"
    And User clicks sign in button
    And User change language as a english

  @UICreateContactAddressSaleVali
  Scenario Outline: Create a new customer
    Given User clicks on Kunden link
    And User clicks on Neuer Kunden link
    #Then Verify that all the required/mandatory fields are marked with * against the field
    #Then Verify that all the fields such as Username, First Name, Last Name, Password and other fields have a valid placeholder
    #And User select  "<customerType>" in the dropdown  input
    And User enter  "<customerName>" in the customer name input
    And User enter  "<eMail>" in the email input
    And User enter  "<company>" in the company name input
    And User enter  "<mobilePhone>" in the mobile number input
    And User enter  "<handly>" in the handly number input
    And User enter  "<fax>" in the fax input
    And User enter  "<taxNumber>" in the tax number input
    And User enter  "<vatId>" in the vat ID input
    And User enter  "<vatId>" in the vat ID input
    And User clicks on address tab and add new address links
    And User complete New Address form
    And User click the Submit button on the new customer

    Examples:
      |customerName|eMail           |company|mobilePhone  |handly |fax             |taxNumber   |vatId|
      |Albert A|xyztxyzt011@gmail.com |Google |0090534434445|1234567890       |9879797987989   |123456      |1234 |
      |Albert A|xyztxyzt012@gmail.com |Google |0090534434445|1234567890       |9879797987989   |123456      |1234 |

Scenario: Update Customer
  Given User clicks on the edit icon on the actions
  Then  Verify that update customer is visible successfully
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





