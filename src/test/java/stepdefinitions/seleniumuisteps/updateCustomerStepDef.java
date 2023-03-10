package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CustomerPage;
import utilities.Driver;

public class updateCustomerStepDef {

    private final CustomerPage kundenPage;

    public updateCustomerStepDef(final CustomerPage kundenPage){
        this.kundenPage = kundenPage;
    }

    @Given("User clicks on the edit icon on the actions")
    public void userClicksOnTheEditIconOnTheActions() {

        kundenPage.clickFunction(kundenPage.customerUpdateIcon);
    }

    @Then("Verify that update customer is visible successfully")
    public void verifyThatUpdateCustomerIsVisibleSuccessfully() {


        String updateCardTitle= kundenPage.getElementText(kundenPage.customerUpdateCardTitle);
        assert updateCardTitle != null;
        Assert.assertTrue(updateCardTitle.equalsIgnoreCase("Update Customer"));
    }

    @And("User update  {string} in the customer Type input")
    public void userSelectInTheDropdownInput(String str) {

       // Driver.selectAnItemFromDropdown(kundenPage.customerType,str);
    }
    @And("User update  {string} in the customer name input")
    public void userEnterInTheCutomerNameInput(String str) {

        kundenPage.sendKeysFunction(kundenPage.customerName, str);
        kundenPage.customerName.getAttribute("value");
        /*
        Driver.waitAndClick(kundenPage.customerName,2);
        
        kundenPage.customerName.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
        Driver.waitAndClear(kundenPage.customerName,3);
*/

    }

    @And("User update  {string} in the email input")
    public void userEnterInTheEmailInput(String str) {
        Driver.waitAndClick(kundenPage.customerEmail,2);
        kundenPage.customerEmail.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);

        Driver.waitAndClear(kundenPage.customerEmail,3);
    }

    @And("User update  {string} in the company name input")
    public void userEnterInTheCompanyNameInput(String str) {
        Driver.waitAndClear(kundenPage.customerFirma,3);
       // Driver.waitAndSendText(kundenPage.customerFirma,str);
    }


    @And("User update  {string} in the mobile number input")
    public void userEnterInTheMobileNumberInput(String str) {

        Driver.waitAndSendText(kundenPage.customerTel,str);
    }

    @And("User update  {string} in the handly number input")
    public void userEnterInTheHandlyNumberInput(String str) {

        Driver.waitAndSendText(kundenPage.customerHandy,str);
    }

    @And("User update  {string} in the fax input")
    public void userUpdateInTheFaxInput(String str) {

        Driver.waitAndSendText(kundenPage.customerFax,str);
    }

    @And("User update  {string} in the tax number input")
    public void userUpdateInTheTaxNumberInput(String str) {

        Driver.waitAndSendText(kundenPage.customerTaxNumber,str);
    }

    @And("User update  {string} in the vat ID input")
    public void userUpdateInTheVatIDInput(String str) {

        Driver.waitAndSendText(kundenPage.customerVatNr,str);
    }



}
