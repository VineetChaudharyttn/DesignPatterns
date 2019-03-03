package Question7;

public class Engineer implements Directory {
    String name;
    String Competency;

    public Engineer(String name, String competency) {
        this.name = name;
        Competency = competency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompetency() {
        return Competency;
    }

    public void setCompetency(String competency) {
        Competency = competency;
    }

    @Override
    public void directoryDetails() {
        System.out.println("Name: "+getName()+ " Competency: "+getCompetency());

    }
}
