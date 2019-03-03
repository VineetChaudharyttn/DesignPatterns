package Question8;

public class StudentRecordsProxy extends StudentRecords {

    public StudentRecordsProxy(User user) {
        super(user);
    }

    @Override
    public void access(){
           if (user.getUserType()=="Admin") {
              System.out.println("You can access the student records .");
              super.access();
           }
           else System.out.println("You have not authorised to access records.");
    }

}
