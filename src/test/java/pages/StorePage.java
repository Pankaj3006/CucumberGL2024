package pages;

import objects.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage{
    public StorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css= "a[title='View cart']")
    private WebElement viewCartLink;

    public void addToCart(Product product){
        By addToCartLink = By.xpath("//a[@aria-label='Add “"+product.getName()+"” to your cart']");
        wait.until(ExpectedConditions.elementToBeClickable(addToCartLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
    }
}
