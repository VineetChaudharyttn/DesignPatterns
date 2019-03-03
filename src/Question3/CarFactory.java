package Question3;

public class CarFactory {
    static  Car buildCar(CarType carType,Location location){
        Car car=null;
        switch (location){
            case CHINA:
                car=ChinaCarFactory.buildCar(carType);
                break;
            case INDIA:
                car=IndianCarFactory.buildCar(carType);
                break;
            case RUSSIA:
                car=RussiaCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}
