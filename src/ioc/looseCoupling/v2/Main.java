package ioc.looseCoupling.v2;

public class Main {

    public static void main(String[] args) {

        GasEngine gasEngine = new GasEngine();
        Car car = new Car(gasEngine);
        car.drive();
        ElectricEngine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.drive();
    }
}
