package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BaseApi {
    public BaseApi(String baseUrl) {
    	RestAssured.baseURI = baseUrl;
    }

    public Response get(String endpoint, int expectedStatusCode) {
        Response response = given()
                .when()
                .get(endpoint);

        // Validate the status code
        if (response.statusCode() != expectedStatusCode) {
            throw new AssertionError("Expected status code " + expectedStatusCode + " but got " + response.statusCode());
        }
        return response;
        }
}
