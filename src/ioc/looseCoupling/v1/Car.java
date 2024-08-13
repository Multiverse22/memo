package ioc.looseCoupling.v1;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        this.engine.run();
    }
}
