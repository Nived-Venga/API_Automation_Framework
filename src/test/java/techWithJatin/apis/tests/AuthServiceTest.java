package techWithJatin.apis.tests;

import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;
import techWithJatin.apis.services.AuthService;
import techWithJatin.models.request.LoginRequest;
import techWithJatin.models.request.SignUpRequest;
import techWithJatin.models.response.LoginResponse;


public class AuthServiceTest {

    @Test
    public void loginTest(){
        LoginRequest loginRequest = new LoginRequest("nived125","nived125");
        AuthService authService = new AuthService();
        Response r = authService.login(loginRequest);
        LoginResponse loginResponse = r.as(LoginResponse.class);
        System.out.println("Response: " + r.asPrettyString());
        Assert.assertEquals(200,r.getStatusCode());
        System.out.println("LoginResponse Username: " + loginResponse.getUsername());
        System.out.println("LoginResponse Email: " + loginResponse.getEmail());
        System.out.println("LoginResponse Type: " + loginResponse.getType());
        System.out.println("LoginResponse Token: " + loginResponse.getToken());
        System.out.println("LoginResponse Roles: " + loginResponse.getRoles());
        System.out.println("LoginResponse Id: " + loginResponse.getId());
    }

    @Test
    public void signUpTest(){
      //  SignUpRequest signUpRequest = new SignUpRequest("nived124","nived124",
        //        "nived124@test.com","nived", "test","0282544654");
       SignUpRequest signUpRequest = new SignUpRequest.
               BuilderClass().
               username("nived126").
               password("nived126").
               email("nvengacert2@gmail.com").
               firstName("nived").
               lastName("test").
               mobileNumber("0282544654").
               build();

        AuthService authService = new AuthService();
        Response r = authService.signUp(signUpRequest);
        System.out.println("Response: " + r.asPrettyString());
    }

    @Test
    public void forgotPasswordTest(){
        AuthService authService = new AuthService();
        Response r = authService.forgotPassword("nvengacert2@gmail.com");
        System.out.println("Response: " + r.asPrettyString());
        r.getStatusCode();
        r.then().log().all();
    }
}
