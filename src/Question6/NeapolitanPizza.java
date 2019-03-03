package Question6;

public class NeapolitanPizza implements Pizza {

    private String info;
    public NeapolitanPizza(){
        info="Neapolitan Pizzaz";
    }
    @Override
    public String info() {
        return info;
    }
}
