package Question7;

public class MainClass {
    public static void main(String[] args) {
        Engineer engineer=new Engineer("Vineet","JVM");
        Engineer engineer1=new Engineer("Dhanendra","JVM");

        HumanResource humanResource=new HumanResource("Arzoo","H. R.");
        HumanResource humanResource1=new HumanResource("ABC","XYZ");

        EngineerDirectory engineerDirectory=new EngineerDirectory();
        engineerDirectory.engineerDirectory.add(engineer);
        engineerDirectory.engineerDirectory.add(engineer1);

        HumanResourceDirectory humanResourceDirectory=new HumanResourceDirectory();
        humanResourceDirectory.humanResourceDirectory.add(humanResource);
        humanResourceDirectory.humanResourceDirectory.add(humanResource1);

        DepartmantDirectory departmantDirectory=new DepartmantDirectory();
        departmantDirectory.departmantDirectory.add(engineerDirectory);
        departmantDirectory.departmantDirectory.add(humanResourceDirectory);

        departmantDirectory.directoryDetails();
    }
}
