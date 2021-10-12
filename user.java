package week4;

public class user {
    String name;
    String phoneNumber;
    String address;
    String userName;
    String password;


    public user()
    {
        String name = null;
        String phoneNumber = null;
        String address = null;
        String userName = null;
        String password = null;
    }

    user(String name, String phoneNumber, String address, String userName, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.userName = userName;
        this.password = password;
    }

}
