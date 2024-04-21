package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="button[value='Apply coupon']")
    private WebElement applyCouponLink;

    @FindBy(css="td[class='product-name'] a")
    private WebElement productNameFld;

    @FindBy(css="input[type='number']")
    private WebElement productQuantityFld;

    @FindBy(css=".checkout-button.button.alt.wc-forward")
    private WebElement checkoutButton;

    public void checkout()
    {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
    }

    public String getProductName()
    {
        wait.until(ExpectedConditions.visibilityOf(applyCouponLink));
        return wait.until(ExpectedConditions.visibilityOf(productNameFld)).getText();
    }

    public String getProductQuantity()
    {
        return wait.until(ExpectedConditions.visibilityOf(productQuantityFld)).getAttribute("value");
    }

}
