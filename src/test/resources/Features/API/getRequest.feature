Feature: Get request

  Scenario: Get request with path params
    Given accept type is json
    And path param id is 10
    When user send get request to "/api/items/{id}
    Then status code is 200
    And response content type is "application/json; charset=utf-8"
    And response payload values match the following: id is 10, name is "Allen", gender is "Male", phone is 1231231231
