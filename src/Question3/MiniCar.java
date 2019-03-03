package Question3;

public class MiniCar extends Car {

    public MiniCar(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Mini Car");
    }
}
