package transport;

import java.util.List;
import java.util.Map;

public class BigCar  extends Transport<Drivers3> {


    private Gruz gruz;

    public BigCar(String brand, String model, double engineCapacity, Drivers3 driver, Map<Transport,Mechanic> mechanic, Gruz gruz) {
        super(brand, model, engineCapacity, driver, mechanic);

            this.gruz = gruz;


    }





    public Gruz getGruz() {

        return gruz;
    }

    public void setGruz(Gruz gruz) {
        this.gruz = gruz;
    }

    @Override
    public void pushDiagnostics() {
        System.out.println("Автомобиль "+ getBrand()+" " + getModel() + "  прошел диагностику");

    }



    @Override
    public void startMoving(){
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }
    @Override
    public void stopMoving(){
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");
    }


    public void printType() {
        if (getGruz() != null){
            System.out.println(getGruz().toString());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-Стоп у грузовика");
    }
    @Override
    public void bestTime() {
        int minSpeed = 100;
        int maxSdeep = 150;
        int speed = (int) (minSpeed + (maxSdeep-minSpeed)*Math.random());
        System.out.println("Лучшее время круга у грузовика" +speed);
    }

    @Override
    public void bestSpeed() {
        int minSpeed = 80;
        int maxSdeep = 120;
        int speed = (int) (minSpeed + (maxSdeep-minSpeed)*Math.random());
        System.out.println("Максимальная скорость у грузовика" +speed);
    }

}
