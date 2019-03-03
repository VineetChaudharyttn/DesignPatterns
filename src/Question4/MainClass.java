package Question4;

public class MainClass {
    public static void main(String[] args) {
        Student student= new StudentBuilder("Dhanendra Kumar",001)
                .hasAge(27)
                .hasClassname(12)
                .hasFather(" ")
                .hasSection("A").build();
        System.out.println(student);
    }
}
