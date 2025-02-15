package techWithJatin.apis.tests;

import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;
import techWithJatin.apis.services.AuthService;
import techWithJatin.apis.services.UserManagementService;
import techWithJatin.models.request.LoginRequest;
import techWithJatin.models.request.SignUpRequest;
import techWithJatin.models.request.UserRequest;
import techWithJatin.models.response.LoginResponse;
import techWithJatin.models.response.GetProfileResponse;

public class UserManagementServiceTest {
    @Test
    public void getProfileTest(){
        AuthService authService = new AuthService();
        Response a = authService.login(new LoginRequest("nived126","nived126"));
        LoginResponse loginResponse = a.as(LoginResponse.class);
        System.out.println("Token: " + loginResponse.getToken());
        UserManagementService userManagementService = new UserManagementService();
        Response r = userManagementService.getProfile(loginResponse.getToken());
        System.out.println("Response: " + r.asPrettyString());
        r.getStatusCode();
        r.then().log().all();

        GetProfileResponse getProfileResponse = r.as(GetProfileResponse.class);
        System.out.println("Email: " + getProfileResponse.getEmail());
        System.out.println("username: " + getProfileResponse.getUsername());
    }

    @Test
    public void updateProfileTest(){
        AuthService authService = new AuthService();
        Response a = authService.login(new LoginRequest("nived126","nived126"));
        LoginResponse loginResponse = a.as(LoginResponse.class);
        System.out.println("Token: " + loginResponse.getToken());

        UserManagementService userManagementService = new UserManagementService();
        UserRequest userRequest = new UserRequest.
                BuilderClass().
                firstName("nived128").
                lastName("nived128").
                email("nvengacert2@gmail.com").
                mobileNumber("0282544654").
                build();
        Response r = userManagementService.updateProfile(userRequest,loginResponse.getToken());
        GetProfileResponse getProfileResponse = r.as(GetProfileResponse.class);
        System.out.println("Response: " + r.asPrettyString());
        Assert.assertEquals(200 , r.getStatusCode());
        Assert.assertEquals("nived128",getProfileResponse.getFirstName());
        r.then().log().all();
    }
}