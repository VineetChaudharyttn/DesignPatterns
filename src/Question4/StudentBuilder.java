package Question4;

public class StudentBuilder {
    private int rollNum;
    private String name;
    private String father;
    private int age;
    private int classname;
    private String section;

    public StudentBuilder(String name,int rollNum){
        this.name=name;
        this.rollNum=rollNum;
    }

    public Student build() {
        return new Student(this);
    }

    public int getRollNum() {
        return rollNum;
    }

    public StudentBuilder setRollNum(int rollNum) {
        this.rollNum = rollNum;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getFather() {
        return father;
    }

    public StudentBuilder hasFather(String father) {
        this.father = father;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder hasAge(int age) {
        this.age = age;
        return this;
    }

    public int getClassname() {
        return classname;
    }

    public StudentBuilder hasClassname(int classname) {
        this.classname = classname;
        return this;
    }

    public String getSection() {
        return section;
    }

    public StudentBuilder hasSection(String section) {
        this.section = section;
        return this;
    }
}
