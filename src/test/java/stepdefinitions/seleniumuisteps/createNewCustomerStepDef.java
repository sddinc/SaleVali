package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.KundenPage;
import pages.RegisterPage;
import utilities.Driver;

public class createNewCustomerStepDef {

    KundenPage kundenPage = new KundenPage();

    @Then("User clicks on Kunden link")
    public void userClicksOnKundenLink() {
        Driver.waitAndClick(kundenPage.menuKunden,2);

    }


    @Given("User clicks on Neuer Kunden link")
    public void user_clicks_on_neuer_kunden_link() {
        Driver.waitAndClick(kundenPage.createNewCustomerLink,2);
        System.out.println("control here");
    }

    @And("User select  {string} in the dropdown  input")
    public void userSelectInTheDropdownInput(String str) {
    Driver.selectAnItemFromDropdown(kundenPage.customerType,str);
    }

    @And("User enter  {string} in the cutomer name input")
    public void userEnterInTheCutomerNameInput(String str) {
        Driver.waitAndSendText(kundenPage.customerName,str);
    }

    @And("User enter  {string} in the email input")
    public void userEnterInTheEmailInput(String str) {
        Driver.waitAndSendText(kundenPage.customerEmail,str);
    }

    @And("User enter  {string} in the company name input")
    public void userEnterInTheCompanyNameInput(String str) {
        Driver.waitAndSendText(kundenPage.customerFirma,str);
    }

    @And("User enter  {string} in the mobile number input")
    public void userEnterInTheMobileNumberInput(String str) {
        Driver.waitAndSendText(kundenPage.customerTel,str);
    }
    @And("User enter  {string} in the handly number input")
    public void userEnterInTheHandlyNumberInput(String str) {
        Driver.waitAndSendText(kundenPage.customerHandy,str);
    }
    @And("User enter  {string} in the fax input")
    public void userEnterInTheFaxInput(String str) {
        Driver.waitAndSendText(kundenPage.customerFax,str);
    }

    @And("User enter  {string} in the tax number input")
    public void userEnterInTheTaxNumberInput(String str) {
        Driver.waitAndSendText(kundenPage.customerTaxNumber,str);
    }

    @And("User enter  {string} in the vat ID input")
    public void userEnterInTheVatIDInput(String str) {
        Driver.waitAndSendText(kundenPage.customerVatNr,str);
    }

    @And("User clicks on address tab and add new address links")
    public void userClicksOnAddressTabAndAddNewAddressLinks() {
        Driver.waitAndClick(kundenPage.customerTabAddress,2);
        Driver.waitAndClick(kundenPage.customerAddNewAddress,2);
        Driver.waitAndClick(kundenPage.customerContactAdressType,2);
        Driver.waitAndClick(kundenPage.customerContactRechnungsadresse,2);
        Driver.waitAndClick(kundenPage.customerContactAndrede,2);
        Driver.waitAndClick(kundenPage.customerContactAndredeOptionHerr,2);
        Driver.waitAndSendText(kundenPage.customerContactName,"Contract name ");
        Driver.waitAndSendText(kundenPage.customerContactFirma,"Firma name ");
        Driver.waitAndSendText(kundenPage.customerContactAddressLine1,"address ");
        Driver.waitAndSendText(kundenPage.customerContactFirma,"Firma name ");
        Driver.waitAndSendText(kundenPage.customerContactAddressLine1,"Adress line 1 ");
        Driver.waitAndSendText(kundenPage.customerContactAddressLine2,"Adress line 2 ");
        Driver.waitAndSendText(kundenPage.customerContactOrtCity,"city here ...");


        Driver.waitAndClick(kundenPage.customerLand,2);
        Driver.waitAndClick(kundenPage.customerLandOptionDesh,2);

    }



    @And("User click the Submit button on the new customer")
    public void userClickTheSubmitButtonOnTheNewCustomer() {

        Driver.waitAndClick(kundenPage.customerSubmit1,2);
    }
    @Then("I expect the registration to {string}")
    public void iExpectTheRegistrationTo(String arg0) {
    }

    @Given("User select {string} address type from list")
    public void userSelectAddressTypeFromList(String arg0) {
    }
    @And("User select  {string} Andrede from list")
    public void userSelectAndredeFromList(String arg0) {

    }



    @And("User complete form  {string}, {string}, {string}, {string}, {string}, {string}")
    public void userCompleteForm(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {


    }
}
