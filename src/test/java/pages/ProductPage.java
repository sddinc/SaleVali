package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
//General
    @FindBy(xpath = "(//span[contains(text(),'Catalog')])[1]")
    public WebElement productCatalogLink;
    @FindBy(xpath = "(//span[contains(text(),'Product')])[1]")
    public WebElement productProductLink;
    @FindBy(xpath = "(//button[contains(text(),'New Items')])[1]")
    public WebElement productNewItems;
  @FindBy(xpath = "(//div[contains(text(),'New Items')])[1]")
    public WebElement productTitleNewItems;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement productItemName;
    @FindBy(xpath = "//input[@name='sku']")
    public WebElement productSkuNumber;
    @FindBy(xpath = "(//div[contains(text(),'New')])[2]")
    public WebElement productCondition;
    @FindBy(xpath = "(//div[contains(text(),'Select...')])[1]")
    public WebElement productSuppliers;
    //@FindBy(xpath = "/input[@name='pricing.net_price']")
    @FindBy(xpath = "//input[@type='number']")
    public WebElement productSalePrice;
    @FindBy(xpath = "//input[@name='grossPrice']")
    public WebElement productSalePriceGross;
    @FindBy(xpath = "//input[@name='purchasePrice']")
    public WebElement productPurchasePrices;
    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement productQuantity;
    @FindBy(xpath = "//div[contains(text(),'19%')]")
    public WebElement productMWSt;

    @FindBy(xpath = "//a[contains(text(),'CATEGORIES')]")
    public WebElement tabCategories;
    @FindBy(xpath = "//button[contains(text(),'Select Category')]")
    public WebElement buttonSelectCategory;
    @FindBy(xpath = "(//div[@class='MuiListItemIcon-root'])[1]")
    public WebElement buttonAddCategory;

    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
    public WebElement productSave;











}