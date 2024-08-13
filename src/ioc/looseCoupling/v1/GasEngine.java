package ioc.looseCoupling.v1;

public class GasEngine implements Engine {

    @Override
    public void run() {
        System.out.println("::: directBinding 가솔린 엔진이 동작합니다.");
    }
}
