package ioc.looseCoupling.v2;

public class GasEngine implements Engine {

    @Override
    public void run() {
        System.out.println("::: looseCoupling 가솔린 엔진이 동작합니다.");
    }
}
