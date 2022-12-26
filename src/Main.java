import transport.Car;

public class Main {
    public static void main(String[] args){
        Car lada = new Car(null,"Granta",1.7, "Желтый", 2015,"Россия");
        lada.setRezSummer(true);

        Car audi = new Car("Audi",null,3.0, "Черный", 2020,"Германия");
        Car bmw = new Car("BMW","Z8",-3.0, "Черный", 2021,"Германия");
        Car kia = new Car("Kia","Sportage 4-го поколения",2.4, null, 2018,"Южная Корея");
        Car hyundai = new Car("Hyundai","Avante",1.6, "Оранжевый", -2016,null);
        printOnCar(lada);
        printOnCar(audi);
        printOnCar(bmw);
        printOnCar(kia);
        printOnCar(hyundai);

    }
    public static void printOnCar( Car car){
        System.out.println(car.getBrand() + " "
                + car.getMadel() + " " + car.getYear()
                + " года выпуска, сборка "  +  car.getCountry()
                + " ," + car.getColor() + " цвет " + " объем двигателя "
                + car.getEngineVolume()+
                car.getKorobka() + " " +car.getKuzov() + " " + car.getNumber() + " " +car.getMest() + " " + car.isRezSummer() +
                (car.getKey().isWithoutKeyAccess() ? "Бесключевой доступ": "Ключевой доступ")+
                (car.getKey().isRemoteRunEngine() ? "Удаленный доступ": "Ключевой доступ")+
                "Номер страховки "+ car.getInsurance().getNumber() + "Стоимость страховки " + car.getInsurance().getCost() +
                "Срок действия страховки " + car.getInsurance().getExpireDate());




    }
}
