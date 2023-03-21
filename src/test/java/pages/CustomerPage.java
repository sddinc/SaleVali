package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseWebDriver;
import utilities.Driver;

public class CustomerPage {
    public CustomerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[contains(text(),'Customer')])[1]")
    public WebElement menuKunden;
    @FindBy(xpath = "//*[contains(text(),'New Customer')]")
    public WebElement createNewCustomerLink;
    @FindBy(xpath = "//div[@class=' css-1hwfws3']")
//form
    public WebElement customerType;
    @FindBy(xpath = "//div/input[@name='name']")
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

    //@FindBy(xpath = "(//button[@type='submit'])[3]")
    @FindBy(xpath = "(//*[contains(text(),'Save')])[2]")
    public WebElement customerSubmitAddress;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement customerNewAddressSave;

    //customer adress
    @FindBy(xpath = "//a[contains(text(),'ADDRESS')]")
    public WebElement customerTabAddress;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement customerAddNewAddress;

    //@FindBy(xpath = "//div[@class='topbar-item']/div/img")
    //public WebElement headerLanguageIcon;

    @FindBy(xpath = "(//div[@class='topbar-item'])[4]")
    public WebElement headerLanguageIcon;

    //@FindBy(xpath = "(//li[@class='navi-item']/a)[1]")
    //public WebElement headerLanguageEnglish;
    @FindBy(xpath = "(//img)[4]")
    public WebElement headerLanguageEnglish;

    @FindBy(xpath = "(//div[contains(text(),'Select...')])[1]")
    public WebElement customerAddressType;

    @FindBy(xpath = "//div[contains(text(), 'Deliver address')]")
    public WebElement customerAddressDeliverAddress;

    @FindBy(xpath = "(//div[contains(text(),'Select...')])[1]")
    public WebElement customerSalutation;

    @FindBy(xpath = "//div[contains(text(), 'Family')]")
    public WebElement customerAddressFamily;

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

    @FindBy(xpath = "(//div[contains(text(), 'Select...')])[1]")
    public WebElement customerLand;

    @FindBy(xpath = "//div[contains(text(), 'Deutschland')]")
    public WebElement customerLandOptionDeutschland;

    @FindBy(xpath = "(//a[@class='btn btn-icon btn-hover-primary btn-sm'])[1]")
    public WebElement customerUpdateIcon;

    @FindBy(xpath = "(//a[@class='btn btn-icon btn-hover-danger btn-sm'])[1]")
    public WebElement customerDeleteIcon;

    @FindBy(xpath = "//div[@class='card-title']")
    public WebElement customerUpdateCardTitle;

    @FindBy(xpath = "//*[contains(text(),'German')]")
    public WebElement languageOptGermany;

    @FindBy(xpath = "//*[contains(text(),'Delete')]")
    public WebElement customerDeleteButton;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement search;

    @FindBy(xpath = "(//li[@class='menu-item'])[2]")
    public WebElement customerBtn;










}