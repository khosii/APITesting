package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Products {

    private Response response;
    private JSONObject requestParams;

    @Given("I click the URL of get products API endpoint")
    public void i_click_the_url_of_get_products_api_endpoint() {
        RestAssured.baseURI = "https://fakestoreapi.com/";
    }

    @When("I pass the URL of products in the request")
    public void i_pass_the_url_of_products_in_the_request() {
        RequestSpecification httpRequest = given();
        response = httpRequest.get("products");
    }

    @Then("I receive the response code as {int}")
    public void i_receive_the_response_code_as(Integer int1) {
        int responseCode = response.getStatusCode();
        assertEquals(int1, responseCode);
    }
//
//    @Then("I verify that the rate of the first product is {double}")
//    public void i_verify_that_the_rate_of_the_first_product_is(Double rate) {
//        double actualRate = response.jsonPath().getDouble("rating[0].rate");
//        assertEquals(rate, actualRate);
//    }

//    @Given("I click the URL of post product API endpoint")
//    public void iClickTheUrlOfPostProductApiEndpoint() {
//        RestAssured.baseURI = "https://fakestoreapi.com";
//        httpRequest = given();
//        requestParams = new JSONObject();
//    }

//    @And("I pass the request body of product title {string}")
//    public void iPassTheRequestBodyOfProductTitle(String title) {
//        requestParams.put("title", title);
//        requestParams.put("price", 13.5);
//        requestParams.put("description", "lorem ipsum set");
//        requestParams.put("image", "https://i.pravatar.cc");
//        requestParams.put("category", "electronic");
//        httpRequest.body(requestParams.toJSONString());
//    }
//
//    @When("I send the post request")
//    public void i_send_the_post_request() {
//        response = httpRequest.post("products");
//    }
//
//    @Then("I receive the response code as {int}")
//    public void i_receive_the_response_code_as(Integer int1) {
//        int responseCode = response.getStatusCode();
//        assertEquals(int1, responseCode);
//    }


//
//    @Then("I receive the response body as id {string}")
//    public void iReceiveTheResponseBodyAsId(String id) {
//        String actualId = response.jsonPath().getString("id");
//        assertEquals(id, actualId);
//    }
}
