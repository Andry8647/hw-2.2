package transport;

public class BigCar  extends Transport<Drivers3> {



    public BigCar(String brand, String model, double engineCapacity, Drivers3 driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public void startMoving(){
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }
    @Override
    public void stopMoving(){
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");
    }@Override
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
