package StepDefination;

import com.packages.Product;
import com.packages.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import junit.framework.Assert;


public class SearchAmazon {

    Product product;
    Search search;
    @Given("I have a search field on Amazon page")
    public void i_have_a_search_field_on_amazon_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step 1:I have a search field on Amazon page");
    }
    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, int price) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step 1:I search for a product with name "+ productName + " price "+ price);
        product = new Product(productName, price);

    }
    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step3: Product with name "+ productName +"  should be displayed");
        search = new Search();
        String name = search.displayProduct(product);
        System.out.println("Search product is :" + name);
        Assert.assertEquals(product.getProductName(), name);
    }
}
