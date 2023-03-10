package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseWebDriver;
import utilities.Driver;

public class RegisterPage extends  Parent{
    public RegisterPage() {
        PageFactory.initElements(BaseWebDriver.getDriver(), this);
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


    @FindBy(xpath = "//*[contains(text(),'Ich akzeptiere die ')]")
    public WebElement checkAcceptTerms;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]")
    public WebElement clickBeforeSubmit;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitRegister;

    @FindBy(xpath = "//h1[text()='Login']")
    public WebElement LoginHeader;


    @FindBy(xpath = "//div[@class='alert-text']")
    public WebElement submitSuccessAlert;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSubmitButton;

    @FindBy(xpath = "//div[@class='modal-title h4']")
    public WebElement loginTitle;

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    public WebElement loginDashboardHeader;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement loginNextButton;




    @FindBy(xpath = "//input[@name='owner']")
    public WebElement enterInhaber;
    @FindBy(xpath = "//input[@name='firma']")
    public WebElement enterFrimenname;
    @FindBy(xpath = "//input[@name='street']")
    public WebElement enterStrasse;
    @FindBy(xpath = "//input[@name='plz']")
    public WebElement enterPlz;
    @FindBy(xpath = "//input[@name='ort']")
    public WebElement enterOrt;
    @FindBy(xpath = "//*[contains(text(),'Select...')]")
    public WebElement enterLand;

    @FindBy(xpath = "//*[contains(text(),'Deutschland')]")
    public WebElement enterLandDeutschland;



    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButtonRegister;

    @FindBy(xpath = "(//div[@class='topbar-item'])[6]")
    public WebElement loginLogoutIcon;
    @FindBy(xpath = "//a[@type='button']")
    public WebElement loginLogoutButton;

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement securityAdvancedButton;

    @FindBy(xpath = "//*[contains(text(),'unsafe')]")
    public WebElement securityUnsafeLink;

    @FindBy(xpath = "(//*[contains(text(),'Kunden')])[1]")
    public WebElement menuKunden;













}