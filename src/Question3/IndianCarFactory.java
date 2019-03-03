package Question3;

public class IndianCarFactory {
    static Car buildCar(CarType cartype) {
        Car car = null;
        switch (cartype) {
            case SUV:
                car = new SUV(Location.INDIA);
                break;
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case SPORTS:
                car = new SportsCar(Location.INDIA);
                break;

        }
        return car;
    }

}
