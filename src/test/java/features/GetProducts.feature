Feature: Get all products from the API

  Scenario: Verify the get API for the products
    Given I click the URL of get products API endpoint
    When I pass the URL of products in the request
    Then I receive the response code as 200

#  Scenario: Verify the rate of the first product is correct
#    Given I click the URL of get products API endpoint
#    When I pass the URL of products in the request
#    Then I verify that the rate of the first product is 3.9


