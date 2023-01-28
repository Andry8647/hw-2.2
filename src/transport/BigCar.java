package transport;

public class BigCar  extends Transport<Drivers3> {


    private Gruz gruz;

    public BigCar(String brand, String model, double engineCapacity, Drivers3 driver, Gruz gruz) {
        super(brand, model, engineCapacity, driver);

            this.gruz = gruz;


    }




    public Gruz getGruz() {

        return gruz;
    }

    @Override
    public void passDiagnostics() {
        if(getDriver().getPrava() != "С" & getDriver().getPrava() != null){
            System.out.println("Права не подходят");
        }else if(getDriver().getPrava() == null){
            System.out.println("Необходимо указать тип прав!");
        }else {
            System.out.println("Права подходят");
        }
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
        if (getGruz() == Gruz.N1){
            System.out.println("До 3.5");
        }else if(getGruz() == Gruz.N2){
            System.out.println("От 3.5 до 12");
        } else if (getGruz() == Gruz.N3){
            System.out.println("От 12");
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
