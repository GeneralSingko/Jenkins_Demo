package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AmazonPage {
    WebDriver driver;

    public AmazonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText="Apple iPhone 15 (128 GB) - Black")
    public WebElement product;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchButton;

    @FindBy(xpath="(//a[@id=\"nav-global-location-popover-link\"])")
    public WebElement pinCode_Icon;

    @FindBy(xpath="(//input[@class=\"GLUX_Full_Width a-declarative\"])")
    public WebElement pinCode_textArea;

    @FindBy(xpath="//input[@aria-labelledby=\"GLUXZipUpdate-announce\"]")
    public WebElement submitButton;

    @FindBy(xpath="(//span[@id=\"glow-ingress-line2\"])")
    public WebElement pinCode;

    public void searchProduct(String productName) {
        searchBox.sendKeys(productName);
    }

    public void clickSearchButton() {
        searchButton.sendKeys(Keys.RETURN);
    }

    public void clickOnProduct() {
        product.sendKeys(Keys.RETURN);
    }

    public void click_pinCodeIcon() {
        pinCode_Icon.click();
    }

    public void enter_PinCode() {
        pinCode_textArea.sendKeys("110003");;
    }

    public void enter_SubmitButton() {
        submitButton.click();
    }

    public String getTextOF() {
        return pinCode.getText();
    }

    public Boolean isDisplayed() {
        if(pinCode.getText() == "New Delhi 110005‌")
            return true;
        else
            return false;
    }

}