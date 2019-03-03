package Question6;

public class Decorator {
    public static void main(String[] args) {
        Pizza pizza=new NeapolitanPizza();
        System.out.println(pizza.info());
        
        TopingsPizza topingsPizza=new TopingsPizza(pizza);
        System.out.println(topingsPizza.info());
    }
}
