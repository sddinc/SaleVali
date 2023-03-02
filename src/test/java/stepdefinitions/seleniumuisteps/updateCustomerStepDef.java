package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CustomerPage;
import utilities.Driver;

public class createNewCustomerStepDef {

    CustomerPage kundenPage = new CustomerPage();

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

    @And("User enter  {string} in the customer name input")
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
    }

    @And("User click the Submit button on the new customer")
    public void userClickTheSubmitButtonOnTheNewCustomer() {
        Driver.waitAndClick(kundenPage.customerSubmitAddress,2);
        Driver.waitAndClick(kundenPage.customerNewAddressSave,2);
    }

    @And("User complete New Address form")
    public void userCompleteNewAddressForm() {
        Driver.waitAndClick(kundenPage.customerAddressType,2);
        Driver.waitAndClick(kundenPage.customerAddressDeliverAddress,2);
        Driver.waitAndClick(kundenPage.customerSalutation,2);
        Driver.waitAndClick(kundenPage.customerAddressFamily,2);
        Driver.waitAndSendText(kundenPage.customerContactName,"Contract name ");
        Driver.waitAndSendText(kundenPage.customerContactFirma,"Company name ");
        Driver.waitAndSendText(kundenPage.customerContactAddressLine1,"Adress line 1 ");
        Driver.waitAndSendText(kundenPage.customerContactAddressLine2,"Adress line 2 ");
        Driver.waitAndSendText(kundenPage.customerContactPlzPostCode,"4565");
        Driver.waitAndSendText(kundenPage.customerContactOrtCity,"Dortmund");
        Driver.waitAndClick(kundenPage.customerLand,2);
        // Driver.waitAndClick(kundenPage.customerLandOptionDeutschland,2);
        // default selected as a Deutschland

    }
    @And("User change language as a english")
    public void userChangeLanguageAsAEnglish() {
        Driver.waitAndClick(kundenPage.headerLanguageIcon,2);
        Driver.waitAndClick(kundenPage.headerLanguageEnglish,2);
    }
}
