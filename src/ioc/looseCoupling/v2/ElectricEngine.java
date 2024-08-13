package ioc.looseCoupling.v2;

public class ElectricEngine implements Engine {

    @Override
    public void run() {
        System.out.println("::: looseCoupling 전기 엔진이 동작합니다.");
    }
}
