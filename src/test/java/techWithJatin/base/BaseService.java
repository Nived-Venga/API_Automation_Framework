package techWithJatin.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import techWithJatin.apis.filters.LoggingFilters;

public class BaseService {

    private static final String BASE_URL = "http://64.227.160.186:8080/";
    private final RequestSpecification requestSpecification;

    static{
        RestAssured.filters(new LoggingFilters());
    }
    public BaseService() {
        requestSpecification = RestAssured.given().baseUri(BASE_URL);
    }

    public Response postRequest(Object payload,String endpoint){
            return requestSpecification.
                    given().
                    contentType(ContentType.JSON).
                    body(payload).log().all().
                    post(BASE_URL + endpoint);
    }

    public Response putRequest(Object payload,String endpoint){
        return requestSpecification.
                given().
                contentType(ContentType.JSON).
                body(payload).log().all().
                put(BASE_URL + endpoint);
    }

    public void setAuthToken(String token){
        requestSpecification.header("Authorization","Bearer " + token);
    }

    public Response getRequest(String endpoint){
        return requestSpecification.
                given().
                contentType(ContentType.JSON).
                log().all().
                get(BASE_URL + endpoint);
    }
}