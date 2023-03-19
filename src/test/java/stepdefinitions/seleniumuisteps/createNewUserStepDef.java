package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.Driver;

public class createNewUserStepDef {
    //CommonPage commonPage = new CommonPage();
    RegisterPage registrationPage = new RegisterPage();

    @Given("Go to salevali homepage {string}")
    public void goToSalevaliHomepage(String url) {
        Driver.getDriver().get(url);

   }


    @Then("User clicks to registration page")
    public void userClicksToRegistrationPage() {
        Driver.waitAndClick(registrationPage.linkToRegisterForm);
    }

    @Then("User enter valid data on the name textbox {string}")
    public void userEnterValidDataOnTheNameTextbox(String strName) {
        Driver.waitAndClick(registrationPage.usernameRegister2);
        Driver.waitAndSendText(registrationPage.usernameRegister2,strName);


    }

    @Then("User enter valid data on the email textbox {string}")
    public void userEnterValidDataOnTheEmailTextbox(String strEmail) {
        Driver.waitAndSendText(registrationPage.emailRegister,strEmail);

    }

    @Then("User enter valid data on the password textbox {string}")
    public void userEnterValidDataOnThePasswordTextbox(String strPassword) {
        Driver.waitAndSendText(registrationPage.passwordRegister,strPassword);
    }

    @Then("User confirm checkbox to registration")
    public void userConfirmCheckboxToRegistration() {
        Driver.waitAndClick(registrationPage.checkAcceptTerms);
    }

    @Then("User clicks submit button")
    public void userClicksSubmitButton() {

        //Driver.waitAndClick(registrationPage.clickBeforeSubmit,1);
        //registrationPage.submitRegister.submit();
        Driver.waitAndClick(registrationPage.submitRegister,3);

    }
    @Then("User should should see the confirm message")
    public void userShouldShouldSeeTheConfirmMessage() {
        String strAlert=Driver.waitAndGetText(registrationPage.submitSuccessAlert,2);
        boolean bol=strAlert.toUpperCase().contains("SALEVALI TEAM");
        //boolean bol=strAlert.toUpperCase().contains("FEHLER");
        System.out.println(strAlert);
        System.out.println("save?:"+bol);
        Assert.assertEquals(true,bol);

    }


    @Then("User verifies that sign in page header is visible")
    public void userVerifiesThatSignInPageHeaderIsVisible() {
/*
        Driver.waitAndClick(registrationPage.securityAdvancedButton,2);
        Driver.waitAndClick(registrationPage.securityUnsafeLink,2);
*/
        Assert.assertEquals(Driver.waitAndGetText(registrationPage.LoginHeader,2),"Login");

    }

    @And("User enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String loginName, String loginPass) {
    Driver.waitAndSendText(registrationPage.loginUserName,loginName);
    Driver.waitAndSendText(registrationPage.loginPassword,loginPass);
    }

    @And("User clicks sign in button")
    public void userClicksSignInButton() {
        Driver.waitAndClick(registrationPage.loginSubmitButton,1);
    }

    @Then("User verifies that sign in is successful")
    public void userVerifiesThatSignInIsSuccessful() {
        Assert.assertEquals(Driver.waitAndGetText(registrationPage.loginTitle,2),"Salevali Team");
         // Driver.waitAndClick(registrationPage.loginNextButton,1);
    }

    @And("User enter valid data on the  Inhaber {string}")
    public void userEnterValidDataOnTheInhaber(String inhaber) {
        Driver.waitAndSendText(registrationPage.enterInhaber,inhaber);
    }

    @And("User enter valid data on the Firmenname {string}")
    public void userEnterValidDataOnTheFirmenname(String firmenname) {
        Driver.waitAndSendText(registrationPage.enterFrimenname,firmenname);
    }

    @And("User enter valid data on the Strasse {string}")
    public void userEnterValidDataOnTheStrasse(String strasse) {
        Driver.waitAndSendText(registrationPage.enterStrasse,strasse);
    }

    @And("User enter valid data on the Plz {string}")
    public void userEnterValidDataOnThePlz(String plz) {
        Driver.waitAndSendText(registrationPage.enterPlz,plz);
    }

    @And("User enter valid data on the Ort {string}")
    public void userEnterValidDataOnTheOrt(String ort) {
        Driver.waitAndSendText(registrationPage.enterOrt,ort);
    }

    @And("User enter valid data on the Land {string}")
    public void userEnterValidDataOnTheLand(String land) {
        Driver.waitAndClick(registrationPage.enterLand,1);
        Driver.waitAndClick(registrationPage.enterLandDeutschland,1);


    }

    @And("User clicks on save button")
    public void userClicksOnSaveButton() {
        Driver.waitAndClick(registrationPage.saveButtonRegister,1);
    }
    @And("User clicks sign out and verifies sign out")
    public void userClicksSignOutAndVerifiesSignOut() {
        Driver.waitAndClick(registrationPage.loginLogoutIcon,1);
        Driver.waitAndClick(registrationPage.loginLogoutButton,1);
        System.out.println("current url");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://dev.salevali.com/logout");

    }

    @Then("User verifies that sign in Dashboard is successful")
    public void userVerifiesThatSignInDashboardIsSuccessful() {
       // Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://dev.salevali.com/dashboard");
        System.out.println("current url");
        System.out.println(Driver.getDriver().getCurrentUrl());

    }

}
