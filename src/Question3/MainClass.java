package Question3;

public class MainClass {
    public static void main(String[] args) {
        Car car=CarFactory.buildCar(CarType.SPORTS,Location.RUSSIA);
        car.construct();
    }
}
