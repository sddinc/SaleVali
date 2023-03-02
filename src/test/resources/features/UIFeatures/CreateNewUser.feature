Feature: Registration


  @UIregistrationSaleVali
  Scenario: Register new users for GMI Bank
    Given Go to salevali homepage "https://dev.salevali.com/auth/registration"
    Then User clicks to registration page
    Then User enter valid data on the name textbox "sdinc"
    Then User enter valid data on the email textbox "technoparc1@gmail.com"
    Then User enter valid data on the password textbox "Pass2022!"
    Then User confirm checkbox to registration
    Then User clicks submit button
    Then User should should see the confirm message

    Scenario Outline:
      Given Go to salevali homepage "https://dev.salevali.com/auth/login"
      Then User verifies that sign in page header is visible
      And User enters username "<username>" and password "<password>"
      And User clicks sign in button
      Then User verifies that sign in is successful
      And User enter valid data on the  Inhaber "<Inhaber>"
      And User enter valid data on the Firmenname "<Firmenname>"
      And User enter valid data on the Strasse "<Strasse und Hausnummer>"
      And User enter valid data on the Plz "<Plz>"
      And User enter valid data on the Ort "<Ort>"
      And User enter valid data on the Land "<Land>"
      And User clicks on save button
      And User clicks sign out and verifies sign out

      Examples:
        |username             |password   |Inhaber        |Firmenname           |Strasse und Hausnummer |Plz    |Ort        |Land|
        |technoparc@gmail.com     |Pass2022!  |mahmu pasa     |technoparc           |Strada  23             |740180 |bucharest  |Romania|

  Scenario Outline: Login to SaleVali
    Given Go to salevali homepage "https://dev.salevali.com/auth/login"
    Then User verifies that sign in page header is visible
    And User enters username "<username>" and password "<password>"
    And User clicks sign in button
    Then User verifies that sign in is successful
    And User clicks sign out and verifies sign out
    Examples:
      | username | password |
      | test3@gmail.com | Pass2022! |