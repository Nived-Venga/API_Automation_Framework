package techWithJatin.models.request;

public class LoginRequest {
    String username;
    String Password;

    public LoginRequest(String username, String password) {
        this.username = username;
        Password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Login{"+"username='"+username+'\''+",Password='"+Password+'\''+'}';
    }
}
