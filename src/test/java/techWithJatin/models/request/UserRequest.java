package techWithJatin.models.request;

public class UserRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;

    private UserRequest(String firstName, String lastName, String email, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public static class BuilderClass{

        private String firstName;
        private String lastName;
        private String email;
        private String mobileNumber;

        public UserRequest build(){
            return new UserRequest(firstName,lastName,email,mobileNumber);
        }

        public UserRequest.BuilderClass email(String email){
            this.email = email;
            return this;
        }

        public UserRequest.BuilderClass firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public UserRequest.BuilderClass lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public UserRequest.BuilderClass mobileNumber(String mobileNumber){
            this.mobileNumber = mobileNumber;
            return this;
        }
    }
}
