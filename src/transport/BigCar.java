package transport;

public class BigCar <A extends Transport & Competing,B extends Drivers3> {
    private String model;

    private String brand;
    private double engineCapacity;
    public BigCar(String model, String brand, double engineCapacity) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineCapacity < 0) {
            this.engineCapacity = 1.6;
        } else {
            this.engineCapacity = engineCapacity;
        }
    }

    public void printInfo(B drivers){
        System.out.println("Водитель " + drivers.getName()  + " управляет автомобилем " + model + " и будет участвовать в заезде");
    }
    public void pitStop() {
        System.out.println("Пит-Стоп");
    }

    public void bestTime() {
        System.out.println("Лучшее время круга");
    }


    public void bestSpeed() {
         System.out.println("Максимальна скорость ");
    }
    public void startMoving(){
        System.out.println("Начал движение " + brand);
    }
    public void stopMoving(){
        System.out.println("Закончить движение " + brand);
    }
}
