package Question4;

public class Student {
    private int rollNum;
    private String name;
    private String father;
    private int age;
    private int classname;
    private String section;

    public Student(StudentBuilder studentBuilder) {
        rollNum=studentBuilder.getRollNum();
        name=studentBuilder.getName();
        father=studentBuilder.getFather();
        age=studentBuilder.getAge();
        classname=studentBuilder.getClassname();
        section=studentBuilder.getSection();
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassname() {
        return classname;
    }

    public void setClassname(int classname) {
        this.classname = classname;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", father='" + father + '\'' +
                ", age=" + age +
                ", classname=" + classname +
                ", section='" + section + '\'' +
                '}';
    }
}
