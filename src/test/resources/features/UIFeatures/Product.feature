Feature: Add new product

  Scenario: Login SaleVali
    Given Go to salevali homepage "https://dev.salevali.com/auth/login"
    Then User verifies that sign in page header is visible
    And User enters username "test1@gmail.com" and password "Pass2022!"
    And User clicks sign in button
    And User change language as a english


  @UICreateContactAddressSaleVali
 Scenario Outline: Add product in the Catalog
    Given User clicks Catalog on the navigation bar
    And User clicks Product on the navigation bar
    And Click New Items button
    And Verify New Items is visible successfully
    And Enter item name int the text box  "<Item name>"
    And Enter SKU number in the text box "<SKU number>"
    And Select condition from dropdown list "<Condition>"
    And Select suppliers from dropdown list "<Suppliers>"
    And Enter sale price int the text box  "<Sale price>"
    And Enter sale price gross int the text box "<Sale price gross>"
    And Enter Purchase Prices int the text box "<Purchase Prices>"
    And Enter Quantity int the text box "<Quantity>"
    And Select MWSt.Steuer from dropdown list "<MWSt. Steuer>"
    And Select Unit from dropdown list "<Unit>"
    And Click Save button in the New Items
    And Verify  product is added to List
    And Verify product price, quantity and price

    Examples:
      | Item name |SKU number| Condition | Suppliers | Sale price | Sale price gross | Purchase Prices | Quantity | MWSt. Steuer | Unit |
      | Ulker |              YZ0011|Good | Yildiz AS  | 10 | 12 | 20 | 5000 | MWSt. Steuer | Piece |
      | Apple |              YZ0021|Good | Technoparc AS  | 50 | 12 | 20 | 5000 | MWSt. Steuer | Piece |
      | 021Apple |              YZ0031|Good | Technoparc AS  | 50 | 12 | 20 | 5000 | MWSt. Steuer | Piece |
      | ??%ˆApple |              YZ0041|Good | Technoparc AS  | 50 | 12 | 20 | 5000 | MWSt. Steuer | Piece |
      | abcdefghjklmnabcdefghjklmnabcdefghjklmnabcdefghjklmnabcdefghjklmn |              YZ0051|Good | Technoparc AS  | 2 | 12 | 20 | 5000 | MWSt. Steuer | Piece |





