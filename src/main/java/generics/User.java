package generics;

public class User extends Person {
    final String emailAddress;
    public User(String name, double height, String emailAddress) {
        super(name, height);
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
