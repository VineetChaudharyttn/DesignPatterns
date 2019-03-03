package Question5;

public class Squre extends Shape {

    String shape;
    public Squre(String shape, Color color) {
        super("4 sides", color);
        this.shape=shape;
    }

    @Override
    public String toString() {
        return "Squre{ shape='" + super.shape + '\'' +
                ", color=" + color.getColorType() +
                '}';
    }
}
