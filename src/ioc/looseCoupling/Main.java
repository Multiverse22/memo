package ioc.looseCoupling;

public class Main {

    public static void main(String[] args) {

        GasEngine gasEngine = new GasEngine();

        Car car = new Car(gasEngine);

        car.drive();
    }
}
