package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CustomerPage;
import pages.ProductPage;
import utilities.Driver;

import java.util.List;

public class deleteProductStepDef {
    ProductPage productPage = new ProductPage();
    CustomerPage kundenPage = new CustomerPage();





    @And("User selects one of the products in the catalog")
    public void userSelectsOneOfTheProductsInTheCatalog() {
      Driver.waitAndClick(productPage.productCheckBoxFirstsProduct,2);
    }

    @And("User selects all sku in the catalog")
    public void userSelectsAllSkuInTheCatalog() {
        Driver.waitAndClick(productPage.productCheckBoxAllList,2);
    }

    @And("User clicks on delete icon on the Article list")
    public void userClicksOnDeleteIconOnTheArticleList() {
        Driver.waitAndClick(productPage.productDeleteButton,2);

    }
}
