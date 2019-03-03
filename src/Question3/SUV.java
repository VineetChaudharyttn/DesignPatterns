package Question3;


public class SUV extends Car {

    public SUV(Location location) {
        super(CarType.SUV, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing SUV Car");
    }
}
