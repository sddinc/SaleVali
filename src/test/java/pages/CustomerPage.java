package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Customer {
    public Customer() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[contains(text(),'Kunden')])[1]")
    public WebElement menuKunden;
    @FindBy(xpath = "//*[contains(text(),'Neuer Kunde')]")
    public WebElement createNewCustomerLink;
    @FindBy(xpath = "//div[@class=' css-1hwfws3']")
//form
    public WebElement customerType;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement customerEmail;
    @FindBy(xpath = "//input[@name='firma']")
    public WebElement customerFirma;

    @FindBy(xpath = "//input[@name='tel']")
    public WebElement customerTel;
    @FindBy(xpath = "//input[@name='handy']")
    public WebElement customerHandy;
    @FindBy(xpath = "//input[@name='fax']")
    public WebElement customerFax;
    @FindBy(xpath = "//input[@name='steuernummer']")
    public WebElement customerTaxNumber;
    @FindBy(xpath = "//input[@name='ustidentnummer']")
    public WebElement customerVatNr;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement customerSubmit1;

    //customer adress
    @FindBy(xpath = "//a[contains(text(),'Adresse')]")
    public WebElement customerTabAddress;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement customerAddNewAddress;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3')[1]")
    public WebElement customerAddress;

    @FindBy(xpath = "(//div[contains(text(), 'AdresseType')])[2]")
    public WebElement customerContactAdressType;

    @FindBy(xpath = "//div[contains(text(), 'Rechnungsadresse')]")
    public WebElement customerContactRechnungsadresse;

    @FindBy(xpath = "(//div[contains(text(), 'Anrede')])[2]")
    public WebElement customerContactAndrede;
    @FindBy(xpath = "//div[contains(text(), 'Herr')]")
    public WebElement customerContactAndredeOptionHerr;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerContactName;


    @FindBy(xpath = "//input[@name='email']")
    public WebElement customerContactEmail;
    @FindBy(xpath = "//input[@name='firma']")
    public WebElement customerContactFirma;

    @FindBy(xpath = "//input[@name='addressLine1']")
    public WebElement customerContactAddressLine1;

    @FindBy(xpath = "//input[@name='addressLine2']")
    public WebElement customerContactAddressLine2;

    @FindBy(xpath = "//input[@name='postCode']")
    public WebElement customerContactPlzPostCode;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement customerContactOrtCity;

    @FindBy(xpath = "(//div[contains(text(), 'Land')])[2]")
    public WebElement customerLand;

    @FindBy(xpath = "//div[contains(text(), 'Deutschland')]")
    public WebElement customerLandOptionDesh;






}