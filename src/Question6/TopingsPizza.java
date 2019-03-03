package Question6;

public class TopingsPizza implements Pizza {

    private Pizza pizza;
    private String info;
    public TopingsPizza(Pizza pizza){
        this.pizza=pizza;
        info="Topings";
    }
    @Override
    public String info() {
        return pizza.info()+" "+info;
    }
}
