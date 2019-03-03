package Question2;

public class PolygonFactory {

    static Polygon getPolygonObject(String nameOfPolygon){
        Polygon polygon=new Polygon();

        switch (nameOfPolygon){
            case "Triangle" :
                polygon.setPolygonArea(new Triangle());
                break;
            case "Hexagon" :
                polygon.setPolygonArea(new Hexagon());
                break;
            case "Pentagon" :
                polygon.setPolygonArea(new Pentagon());
                break;
        }

        return polygon;
    }

}
