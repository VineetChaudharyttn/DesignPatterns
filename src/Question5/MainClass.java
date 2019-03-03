package Question5;

public class MainClass {
    public static void main(String[] args) {
        Color color=new Red();
        Triangle shape=new Triangle("Triangle",color);
        System.out.println(shape);
        
        Shape shape1=new Squre("Squre", color);
        System.out.println(shape1);
    }
}
