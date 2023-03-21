Feature: Add new product

  Scenario: Login SaleVali
    Given Go to salevali homepage "https://dev.salevali.com/auth/login"
    Then User verifies that sign in page header is visible
    And User enters username "test1@gmail.com" and password "Pass2022!"
    And User clicks sign in button
    And User change language as a english

  Scenario: Delete a product from the catalog
    Given User clicks Catalog on the navigation bar
    And User clicks Product on the navigation bar
    And User selects one of the products in the catalog
    And User clicks on delete icon on the Article list
    Then User confirms by the delete button

  Scenario: Delete all products from the catalog
    Given User clicks Catalog on the navigation bar
    And User clicks Product on the navigation bar
    And User selects all sku in the catalog
    And User clicks on delete icon on the Article list
    Then User confirms by the delete button








