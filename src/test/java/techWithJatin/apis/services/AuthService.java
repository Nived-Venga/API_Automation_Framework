package techWithJatin.apis.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import techWithJatin.base.BaseService;

import java.util.HashMap;

public class AuthService extends BaseService {

    String BASE_PATH = RestAssured.basePath + "api/auth/";

    public Response login(Object payload){
        return postRequest(payload,BASE_PATH + "login");
    }

    public Response signUp(Object payload){
        return postRequest(payload,BASE_PATH + "signup");
    }

    public Response forgotPassword(String emailAddress){
        HashMap<String,String> payload = new HashMap<>();
        payload.put("email",emailAddress);
       return postRequest(payload,BASE_PATH + "forgot-password");

    }
}