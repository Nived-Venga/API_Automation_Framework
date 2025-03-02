package techWithJatin.apis.tests;

import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techWithJatin.apis.services.AuthService;
import techWithJatin.models.request.LoginRequest;
import techWithJatin.models.response.LoginResponse;

@Listeners(techWithJatin.apis.listeners.TestListener.class)
public class LoginTest {

    //Logger
    private static final Logger log = LogManager.getLogger(LoginTest.class);

    @Test
        public void loginTest(){

            /* builder pattern - request **/
            LoginRequest loginRequest = new LoginRequest("nived125","nived125");
            /* service calls **/
            AuthService authService = new AuthService();
            Response r = authService.login(loginRequest);
            /* builder pattern - response **/
            LoginResponse loginResponse = r.as(LoginResponse.class);
            log.info("Response: {}", r.asPrettyString());
            Assert.assertEquals(r.getStatusCode(), 200);
            log.info("LoginResponse Username: {}", loginResponse.getUsername());
            log.info("LoginResponse Email: {}", loginResponse.getEmail());
            log.info("LoginResponse Type: {}", loginResponse.getType());
            log.info("LoginResponse Token: {}", loginResponse.getToken());
            log.info("LoginResponse Roles: {}", loginResponse.getRoles());
            log.info("LoginResponse Id: {}", loginResponse.getId());
        }

    @Test
    public void login1Test(){
            System.out.println("login1Test");
    }
}
