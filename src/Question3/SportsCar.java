package Question3;

public class SportsCar extends Car {

    public SportsCar(Location location) {
        super(CarType.SPORTS, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Sports Car");
    }
}
