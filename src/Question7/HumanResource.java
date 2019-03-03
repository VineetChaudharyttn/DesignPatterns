package Question7;

public class HumanResource implements Directory {
    String name;
    String type;

    public HumanResource(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void directoryDetails() {
        System.out.println(name + " " + type);
    }
}
