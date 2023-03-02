Feature: Create a new customer
  @UIregistrationSaleVali
  Scenario: Register new users for SaleVali
    Given Go to salevali homepage "https://dev.salevali.com/auth/registration"
    Then User enter valid data on the name textbox "sdinc"
    Then User enter valid data on the email textbox "test1@gmail.com"
    Then User enter valid data on the password textbox "Pass2023!"
    Then User confirm checkbox to registration
    Then User clicks submit button
    Then User should should see the confirm message

    Scenario Outline:
      Given Go to salevali homepage "https://dev.salevali.com/auth/login"
      Then User verifies that sign in page header is visible
      And User enters username "<username>" and password "<password>"
      And User clicks sign in button
      Then User verifies that sign in is successful
      And User enter valid data on the  Inhaber "<CustomerName>"
      And User enter valid data on the Firmenname "<CustomerCompaney>"
      And User enter valid data on the Strasse "<StreetAndNumber>"
      And User enter valid data on the Plz "<ZipCode>"
      And User enter valid data on the Ort "<customerCity>"
      And User enter valid data on the Land "<customerCountry>"
      And User clicks on save button
      And User clicks sign out and verifies sign out

      Examples:
        |username             |password   |CustomerName        |CustomerCompaney           |StreetAndNumber |ZipCode    |customerCity        |customerCountry|
        |test1@gmail.com     |Pass2022!  |mahmut pasa     |Facebook           |Strada  23             |740180 |bucharest 23  |Norway|

  Scenario Outline: Login to SaleVali
    Given Go to salevali homepage "https://dev.salevali.com/auth/login"
    Then User verifies that sign in page header is visible
    And User enters username "<username>" and password "<password>"
    And User clicks sign in button
    Then User verifies that sign in is successful
    And User clicks sign out and verifies sign out
    Examples:
      | username | password |
      | test1@gmail.com | Pass2022! |