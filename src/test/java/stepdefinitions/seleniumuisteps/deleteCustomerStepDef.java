package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CustomerPage;
import utilities.Driver;

import java.util.List;

public class deleteCustomerStepDef {

    private CustomerPage customerPage;
    CustomerPage kundenPage = new CustomerPage();

    @And("User clicks on delete icon")
    public void userClciksOnDeleteIcon() {

        List<WebElement> deleteIcons = Driver.getDriver().findElements(By.xpath("//a[@class='btn btn-icon btn-hover-danger btn-sm']"));


        int nrDeleteIcons=deleteIcons.size();
        System.out.println("number"+nrDeleteIcons);

        while(nrDeleteIcons>0){
            Driver.waitAndClick(kundenPage.customerDeleteIcon,2);
            Driver.wait(2);
            Driver.waitAndClick(kundenPage.customerDeleteButton,2);
            nrDeleteIcons--;
        }


    }

    @And("User confirms by the delete button")
    public void userConfirmsByTheDeleteButton() {

    }

    @Then("Verifies that deleted customer from the list")
    public void verifiesThatDeletedCustomerFromTheList() {
    }

}
