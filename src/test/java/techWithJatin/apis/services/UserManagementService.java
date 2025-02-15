package techWithJatin.apis.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import techWithJatin.base.BaseService;
import techWithJatin.models.request.UserRequest;

public class UserManagementService extends BaseService {

    String BASE_PATH = RestAssured.basePath = "api/users/";



    public Response getProfile(String token){
        setAuthToken(token);
        return getRequest(BASE_PATH + "profile");
    }

    public Response updateProfile(Object payload,String token){
        setAuthToken(token);
        return putRequest( payload,BASE_PATH + "profile");
    }
}