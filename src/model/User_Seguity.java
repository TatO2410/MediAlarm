
package model;

public class User_Seguity {
    
    private String user_id;
    private String email;
    private String password;

    public User_Seguity( String user_id,  String password, String email) {
        this.user_id = user_id;
        this.email = email;
        this.password = password;
    }
    
    public User_Seguity(String user_id){
         this.user_id = user_id;
    
    }
    
    public User_Seguity(String password, String email) {
        this.email = email;
        this.password = password;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}