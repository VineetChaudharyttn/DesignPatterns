package Question2;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Polygon polygon=PolygonFactory.getPolygonObject("Triangle");
        polygon.getPolygonArea().area();


        Polygon polygon1=PolygonFactory.getPolygonObject("Hexagon");
        polygon1.getPolygonArea().area();

        Polygon polygon2=PolygonFactory.getPolygonObject("Pentagon");
        polygon2.getPolygonArea().area();
    }
}
