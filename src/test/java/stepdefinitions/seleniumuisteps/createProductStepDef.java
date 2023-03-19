package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CustomerPage;
import pages.ProductPage;
import utilities.Driver;

public class createProductStepDef {

    public static WebDriver driver;
    ProductPage productPage = new ProductPage();


    @Given("User clicks Catalog on the navigation bar")
    public void userClicksCatalogOnTheNavigationBar() {
        Driver.waitAndClick(productPage.productCatalogLink);
    }

    @And("User clicks Product on the navigation bar")
    public void userClicksProductOnTheNavigationBar() {
        Driver.waitAndClick(productPage.productProductLink);
    }

   ///

    @And("Click New Items button")
    public void clickNewItemsButton() {
    Driver.waitAndClick(productPage.productNewItems,2);
    }
    @And("Verify New Items is visible successfully")
    public void verifyNewItemsIsVisibleSuccessfully() {
        String strTitle=Driver.waitAndGetText(productPage.productTitleNewItems,2);
        System.out.println("string test->"+strTitle);
        Assert.assertEquals(strTitle,"New Items");

    }


    @And("Enter item name int the text box  {string}")
    public void enterItemNameIntTheTextBox(String str) {
    Driver.waitAndSendText(productPage.productItemName,str);
    }

    @And("Enter SKU number in the text box {string}")
    public void enterSKUNumberInTheTextBox(String str) {
        Driver.waitAndSendText(productPage.productSkuNumber,str);
    }

    @And("Select condition from dropdown list {string}")
    public void selectConditionFromDropdownList(String str) {
        /*
        Driver.waitAndClick(productPage.productCondition,2);
        Driver.waitAndSendText(productPage.productSkuNumber,str);

         */
    }

    @And("Select suppliers from dropdown list {string}")
    public void selectSuppliersFromDropdownList(String arg0) {
    }

    @And("Enter sale price int the text box  {string}")
    public void enterSalePriceIntTheTextBox(String str) {
        //Driver.waitAndClick(productPage.productSalePrice,2);
        //productPage.productSalePrice.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        Driver.waitAndSendText(productPage.productSalePrice,str);

    }

    @And("Enter sale price gross int the text box {string}")
    public void enterSalePriceGrossIntTheTextBox(String str) {
        //Driver.waitAndSendText(productPage.productSalePriceGross,str);

    }

    @And("Enter Purchase Prices int the text box {string}")
    public void enterPurchasePricesIntTheTextBox(String str) {
        Driver.waitAndSendText(productPage.productSalePrice,str);
    }

    @And("Enter Quantity int the text box {string}")
    public void enterQuantityIntTheTextBox(String str) {
        Driver.waitAndSendText(productPage.productQuantity,str);
    }

    @And("Select MWSt.Steuer from dropdown list {string}")
    public void selectMWStSteuerFromDropdownList(String str) {

        //Driver.waitAndSendText(productPage.productMWSt,str);
    }

    @And("Select Unit from dropdown list {string}")
    public void selectUnitFromDropdownList(String arg0) {
    }

    @And("Click Save button in the New Items")
    public void clickSaveButtonInTheNewItems() {


        Driver.waitAndClick(productPage.tabCategories,2);
        Driver.waitAndClick(productPage.buttonSelectCategory,2);
        Driver.waitAndClick(productPage.buttonAddCategory,2);
        Driver.waitAndClick(productPage.productSave,2);
    }

    @And("Verify  product is added to List")
    public void verifyProductIsAddedToList() {

    }

    @And("Verify product price, quantity and price")
    public void verifyProductPriceQuantityAndPrice() {
    }


}
