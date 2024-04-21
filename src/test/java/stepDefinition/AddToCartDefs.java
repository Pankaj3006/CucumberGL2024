package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.Product;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CartPage;
import pages.StorePage;


public class AddToCartDefs {

    private WebDriver driver;
    private WebDriverWait wait;

    @Given("Open store page")
    public void open_store_page() {
        driver = DriverFactory.getDriver();
        StorePage storePage = new StorePage(driver);
        storePage.load("https://askomdch.com/store/");
    }

    @When("Add a {product} to the cart")
    public void add_a_to_the_cart(Product product) {
        new StorePage(driver).addToCart(product);
    }

    @Then("I should see {int} {product} added in the cart")
    public void i_should_see_added_in_the_cart(int quantity, Product product) {
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(quantity, Integer.parseInt(cartPage.getProductQuantity()));
        Assert.assertEquals(product.getName(), cartPage.getProductName());
    }
}
