package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="input[id='billing_first_name']")  private WebElement firstName;
    @FindBy(css="input[id='billing_last_name']")  private WebElement lastName;
    @FindBy(id="billing_country") private WebElement countryName;
    @FindBy(css="input[id='billing_address_1']") private WebElement address;
    @FindBy(css="input[id='billing_city']") private WebElement cityName;
    @FindBy(id="billing_state") private WebElement stateName;
    @FindBy(css="input[id='billing_postcode']") private WebElement zip;
    @FindBy(css="input[id='billing_email']") private WebElement emailAddress;
    @FindBy(css="button[id='place_order']") private WebElement placeOrderButton;
    @FindBy(css=".woocommerce-order-details__title") private WebElement checkoutText;
    @FindBy(css=".woocommerce-notice") private WebElement noticeText;

    public CheckoutPage enterFirstName(String text)
    {
        fillText(firstName, text);
        return this;
    }

    public CheckoutPage enterLastName(String text)
    {
        fillText(lastName, text);
        return this;
    }

    public CheckoutPage enterAddress(String text)
    {
        fillText(address, text);
        return this;
    }

    public CheckoutPage enterCityName(String text)
    {
        fillText(cityName, text);
        return this;
    }

    public CheckoutPage enterZip(String text)
    {
        fillText(zip, text);
        return this;
    }

    public CheckoutPage enterEmailAddress(String text)
    {
        fillText(emailAddress, text);
        return this;
    }

    public CheckoutPage selectCountry(String text)
    {
        selectDropDownValues(countryName, text);
        return this;
    }

    public CheckoutPage selectState(String text)
    {
        selectDropDownValues(stateName, text);
        return this;
    }

    public void clickPlaceOrder()
    {
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
        wait.until(ExpectedConditions.visibilityOf(checkoutText));
    }

    public String returnNoticeText()
    {
        return wait.until(ExpectedConditions.visibilityOf(noticeText)).getText();
    }

    private void fillText(WebElement ele, String text)
    {
        wait.until(ExpectedConditions.visibilityOf(ele));
        ele.clear();
        ele.sendKeys(text);
    }

    private void selectDropDownValues(WebElement ele, String text)
    {
        Select select = new Select(wait.until(ExpectedConditions.visibilityOf(ele)));
        select.selectByVisibleText(text);
    }


}
