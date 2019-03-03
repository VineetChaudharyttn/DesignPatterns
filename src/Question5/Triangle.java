package Question5;

public class Triangle extends Shape {

    String shape;
    public Triangle(String shape, Color color) {
        super("3 sidded", color);
        this.shape=shape;
    }

    @Override
    public String toString() {
        return "Triangle{ shape='" + super.shape + '\'' +
                ", color=" + color.getColorType() +
                '}';
    }
}
