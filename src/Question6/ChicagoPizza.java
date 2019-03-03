package Question6;

public class ChicagoPizza implements Pizza {

    private String info;

    public ChicagoPizza() {
        this.info = "Chicago Pizza";
    }

    @Override
    public String info() {
        return info;
    }
}
