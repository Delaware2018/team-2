package team.two.goodwill;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter @Setter @NoArgsConstructor
public class User{




    @Id
    private int key;

    private String name;
    private int zipCode;
    private long phoneNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber; }


<<<<<<< HEAD
     public static void createUser(User user2){
        String test = "Select * FROM Employee" + user2.getName() + "AND pass = ' ' " + user2.getName()+ "' '";
        return ;
    }
=======
     public static void createUser(User user){
        System.out.println("TESTING: Name: " + user.getName() + "\nZip: " + user.getZipCode() + "\nPhone: " + user.getPhoneNumber());
     }
>>>>>>> 47d6ece0f5a1826dcbf485f03e29a8e377c0a1ff


}
