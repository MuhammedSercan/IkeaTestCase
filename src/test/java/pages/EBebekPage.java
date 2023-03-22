package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EBebekPage {
    public EBebekPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//input[@id='txtSearchBox']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='product-item-anchor ng-star-inserted'])[22]")
    public WebElement firstProduct;

    @FindBy(xpath = "(//header[@class='title-wrapper'])[2]")
    public WebElement firstProductName;
    @FindBy(xpath = "//h1[@id='product-name']")
    public WebElement secondProductName;
    @FindBy(xpath = "(//div[@data-test-id='product-card-image-container'])[2]")
    public WebElement secondProduct;
    @FindBy(xpath = "//button[@id='addToCart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "//button[@class='add-to-basket button small']")
    public WebElement otherSellerAddToCartButton;
    @FindBy(xpath = "//a[@class='checkoutui-Modal-iHhyy79iR28NvF33vKJb']")
    public WebElement popUpXButton;
    @FindBy(xpath = "//*[text()='Sepete git']")
    public WebElement popUpViewCartButton;
    @FindBy(xpath = "(//span[@class='merchantLink_2Ii8s'])[1]")
    public WebElement firstSeller;
    @FindBy(xpath = "(//span[@class='merchantLink_2Ii8s'])[2]")
    public WebElement secondSeller;
    @FindBy(xpath = "//h1[text()='Sepetim']")
    public WebElement cartPageText;
    @FindBy(xpath = "(//div[@class='merchantBoxWrapper_10ife'])[1]")
    public WebElement firstProductInfoBox;
    @FindBy(xpath = "(//div[@class='merchantBoxWrapper_10ife'])[2]")
    public WebElement secondProductInfoBox;

}