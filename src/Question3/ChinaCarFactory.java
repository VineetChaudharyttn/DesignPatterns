package Question3;

public class ChinaCarFactory {
    static Car buildCar(CarType carType){
        Car car=null;
        switch (carType){
            case SPORTS:
                car=new SportsCar(Location.CHINA);
                break;
            case MINI:
                car=new MiniCar(Location.CHINA);
                break;
            case SUV:
                car=new SUV(Location.CHINA);
                break;
        }
        return car;
    }
}
