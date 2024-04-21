package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import objects.Product;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CartPage;
import pages.CheckoutPage;
import pages.StorePage;

import java.util.List;
import java.util.Map;

public class CheckoutDefs {

    private WebDriver driver;
    private WebDriverWait wait;

    @Given("user on the checkout page after adding {product} to the cart")
    public void user_on_the_checkout_page_after_adding_blue_shoes_to_the_cart(Product product) {
        driver = DriverFactory.getDriver();
        StorePage storePage = new StorePage(driver);
        CartPage cartPage = new CartPage(driver);
        storePage.load("https://askomdch.com/store/");
        storePage.addToCart(product);
        cartPage.checkout();
    }

    @When("user provide billing details")
    public void user_provide_billing_details(DataTable dataTable) {
        List<Map<String, String>> billingDetails = dataTable.asMaps();

        CheckoutPage checkoutPage =new CheckoutPage(driver);
        checkoutPage.enterFirstName(billingDetails.get(0).get("firstname"));
        checkoutPage.enterLastName(billingDetails.get(0).get("lastname"));
        checkoutPage.selectCountry(billingDetails.get(0).get("country"));
        checkoutPage.enterAddress(billingDetails.get(0).get("address"));
        checkoutPage.enterCityName(billingDetails.get(0).get("city"));
        checkoutPage.selectState(billingDetails.get(0).get("state"));
        checkoutPage.enterZip(billingDetails.get(0).get("zip"));
        checkoutPage.enterEmailAddress(billingDetails.get(0).get("email"));
    }

    @And("user place an order")
    public void user_place_an_order() {
      new CheckoutPage(driver).clickPlaceOrder();
    }
    @Then("user should be placed successfully place order")
    public void user_should_be_placed_successfully_place_order() {

        String text = new CheckoutPage(driver).returnNoticeText();
        Assert.assertEquals("Thank you. Your order has been received.", text);

    }
}
