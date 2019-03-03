package Question8;

public class MainClass {
    public static void main(String[] args) {
    User admin=new User("Admin");
    Accessable access=new StudentRecordsProxy(admin);
    access.access();

    User user=new User("User");
    Accessable access1=new StudentRecordsProxy(user);
    access1.access();
    }
}