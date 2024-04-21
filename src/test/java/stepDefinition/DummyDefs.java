package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.Password;
import objects.Product;
import objects.Username;


public class DummyDefs {

    @Given("I am on the store/product page")
    public void i_am_on_the_store_page() {
        System.out.println("Inside --> I am on the store page");
    }
    @When("I add a {product} to the cart")
    public void i_add_a_to_the_cart(Product product) {
        System.out.println("Inside --> I add a "+ product.getName() +" to the cart");
    }
    @Then("I see {int} {string} added in the cart")
    public void i_see_added_in_the_cart(Integer int1, String string) {
        System.out.println("Inside --> I see "+ int1 + " product(s) added into the cart");
    }

    @Given("User is on Login page")
    public void user_is_on_login_page() {
        System.out.println("Inside --> User is on login page");
    }

    @When("Enter Correct {username} and Correct {password}")
    public void enter_correct_and_correct(Username username, Password password) {
        System.out.println("Inside --> Enter Correct: "+username.getName()+
                " and Correct: "+password.getName());
    }
    @Then("user should be successfully logged in")
    public void user_should_be_successfully_logged_in() {
        System.out.println("Inside --> user should be successfully logged in");
    }
}







































































