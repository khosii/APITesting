#Feature: Insert products using POST API
#
#  Scenario Outline: Validate post product API works correctly
#    Given I click the URL of post product API endpoint
#    And I pass the request body of product title <ProductTitle>
#    When I send the post request
#    Then I receive the response code as 200
#
#    Examples:
#      | ProductTitle |
#      | Shoes        |
#
#  Scenario Outline: Validate post product API response body works correctly
#    Given I click the URL of post product API endpoint
#    And I pass the request body of product title <Shoes>
#    When I send the post request
#    Then I receive the response body as id <id>
#
#    Examples:
##      | ProductTitle | id |
#      | Shoes        | 21 |
