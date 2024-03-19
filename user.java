import java.util.Date;

public class User extends Person{


    private int adressId;

    private String email;
    private  String passwordHash;
    private String tcNo;

    public User() {
        super();
    }

    public User(int id, String firstname, String lastname, Date birthdate, int adressId, String email, String passwordHash, String tcNo) {
        super(id, firstname, lastname, birthdate);
        this.adressId = adressId;
        this.email = email;
        this.passwordHash = passwordHash;
        this.tcNo = tcNo;
    }


}
