package demo;

public class ILoginInput {
    private String email = null;
    private String password = null;

    ILoginInput(String email, String password) {
        this.email = email;
        this.password = password;
    }

    String getEmail(){
        return  this.email;
    }
    String getPassword(){
        return  this.password;
    }
}

