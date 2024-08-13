package ioc.directBinding.v2;

public class Car {

    private String model;

    private GasEngine gasengine;
    private ElectricEngine electricEngine;

    public Car(String model) {
        this.model = model;
        if(model.equals("gas")) {
            gasengine =new GasEngine();
        } else if (model.equals("electric")) {
            electricEngine =new ElectricEngine();
        }

    }

    public void drive() {
        if (model.equals("gas")) {
            this.gasengine.run();
        } else if (model.equals("electric")) {
            this.electricEngine.run();
        }
    }
}
