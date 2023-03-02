Feature: Registration

  @UIregistrationSaleVali
  Scenario Outline: Login to SaleVali
    Given Go to salevali homepage "https://dev.salevali.com/auth/login"
    Then User verifies that sign in page header is visible
    And User enters username "<username>" and password "<password>"
    And User clicks sign in button
    Then User verifies that sign in is successful
    And User clicks sign out and verifies sign out
    Examples:
      | username | password |
      | technoparc@gmail.com | Pass2022! |