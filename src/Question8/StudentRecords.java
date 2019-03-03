package Question8;

public class StudentRecords implements Accessable {
    protected User user;

    public StudentRecords(User user) {
        this.user = user;
    }

    @Override
    public void access() {
        System.out.println("Record Access");
    }
}
