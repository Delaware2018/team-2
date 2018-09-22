package team.two.goodwill;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="credentials")
public class Credentials {

    public Credentials(){}

    @Id
    private int key;

    private String username;
    private String password;
    private String passwordVer;

    public String getPasswordVer() {
        return passwordVer;
    }
    public void setPasswordVer(String passwordVer) {
        this.passwordVer = passwordVer;
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


    public static boolean isValid(Credentials input){
     return true/*input.password.length() > 8 && input.password != input.username && input.password == input.passwordVer*/;
    }

    public static void create(Credentials input){

    }

    public static boolean isUser(Credentials input){
        //Verifying input
        return true;
    }
}
