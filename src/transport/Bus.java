package transport;

public class Bus  extends Transport<Drivers2>  {


    public Bus(String brand, String model, double engineCapacity, Drivers2 driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public void startMoving(){
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }
    @Override
    public void stopMoving(){
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }



    @Override
    public void pitStop() {
        System.out.println("Пит-Стоп у автобуса");
    }
    @Override
    public void bestTime() {
        int minSpeed = 50;
        int maxSdeep = 70;
        int speed = (int) (minSpeed + (maxSdeep-minSpeed)*Math.random());
        System.out.println("Лучшее время круга у автобуса" +speed);
    }

    @Override
    public void bestSpeed() {
        int minSpeed = 100;
        int maxSdeep = 200;
        int speed = (int) (minSpeed + (maxSdeep-minSpeed)*Math.random());
        System.out.println("Максимальная скорость у автобуса" +speed);
    }

}

    //    public Bus(String brand, String madel, String color, int year, String country, int maxSpeed) {
//        super(brand, madel, color, year, country, maxSpeed);
//    }

