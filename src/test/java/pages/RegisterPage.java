package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//*[text()='Kostenlos Registieren']")
    public WebElement linkToRegisterForm;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement usernameRegister;


    @FindBy(xpath = "//input[@placeholder='Trage deinen Namen ein']")
    public WebElement usernameRegister2;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailRegister;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordRegister;


    @FindBy(xpath = "///input[@id='acceptTerms']")
    public WebElement checkAcceptTerms;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]")
    public WebElement clickBeforeSubmit;

    @FindBy(xpath = "//span[@class='text-white']")
    public WebElement submitRegister;

    @FindBy(xpath = "//h3[text()='Login']")
    public WebElement LoginHeader;


    @FindBy(xpath = "//div[@class='alert-text']")
    public WebElement submitSuccessAlert;

    @FindBy(xpath = "//input[@name='emailOrUsername']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSubmitButton;

    @FindBy(xpath = "//div[@class='modal-title h4']")
    public WebElement loginTitle;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement loginNextButton;




    @FindBy(xpath = "//input[@placeholder='Enter Inhaber']")
    public WebElement enterInhaber;
    @FindBy(xpath = "//input[@name='firma']")
    public WebElement enterFrimenname;
    @FindBy(xpath = "//input[@placeholder='Enter Strasse']")
    public WebElement enterStrasse;
    @FindBy(xpath = "//input[@placeholder='Enter Plz']")
    public WebElement enterPlz;
    @FindBy(xpath = "//input[@placeholder='Enter Ort']")
    public WebElement enterOrt;
    @FindBy(xpath = "//input[@placeholder='Enter Land']")
    public WebElement enterLand;


    @FindBy(xpath = "  (//button[@type='button'])[2]")
    public WebElement saveButtonRegister;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement loginLogout;

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement securityAdvancedButton;

    @FindBy(xpath = "//*[contains(text(),'unsafe')]")
    public WebElement securityUnsafeLink;

    @FindBy(xpath = "(//*[contains(text(),'Kunden')])[1]")
    public WebElement menuKunden;













}