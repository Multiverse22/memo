package ioc.looseCoupling.v2;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        this.engine.run();
    }
}
