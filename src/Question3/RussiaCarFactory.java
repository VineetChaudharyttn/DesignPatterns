package Question3;

public class RussiaCarFactory {
    static Car buildCar(CarType carType){
        Car car= null;
        switch (carType){
            case SUV:
                car=new SUV(Location.RUSSIA);
                break;
            case MINI:
                car=new MiniCar(Location.RUSSIA);
                break;
            case SPORTS:
                car=new SportsCar(Location.RUSSIA);
                break;
        }
        return car;
    }
}
