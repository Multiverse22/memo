package ioc.directBinding.v2;

public class Main {

    public static void main(String[] args) {
        Car gasCar =new Car("gas");
        gasCar.drive();

        Car ElectricCar =new Car("electric");
        ElectricCar.drive();
    }
}
