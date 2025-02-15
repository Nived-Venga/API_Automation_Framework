package techWithJatin.models.request;

public class SignUpRequest {

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    private SignUpRequest(String username, String password, String email, String firstName, String lastName, String mobileNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "SignUpRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public static class BuilderClass{
        private String username;
        private String password;
        private String email;
        private String firstName;
        private String lastName;
        private String mobileNumber;

        public SignUpRequest build() {
            return new SignUpRequest(username,password,email,firstName,lastName,mobileNumber);
        }

            public BuilderClass username(String username){
                this.username = username;
                return this;
            }
        public BuilderClass password(String password){
            this.password = password;
            return this;
        }
        public BuilderClass email(String email){
            this.email = email;
            return this;
        }

        public BuilderClass firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public BuilderClass lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public BuilderClass mobileNumber(String mobileNumber){
            this.mobileNumber = mobileNumber;
            return this;
        }
    }
}