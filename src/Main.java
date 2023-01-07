import transport.Bus;
import transport.Car;
import transport.Transport;

public class Main {
    public static void main(String[] args){
        Car lada = new Car("Lada",null, "Желтый", 2015,"Россия",60,
                2.2,"MКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());
      //  lada.setRezSummer(true);

        Car audi = new Car("Audi",null, "Черный", 2020,"Германия",60,2.2,"АКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());
        Car bmw = new Car("BMW","Z8", "Черный", 2021,"Германия",60,2.2,"АКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());
        Car kia = new Car("Kia","Sportage 4-го поколения", null, 2018,"Южная Корея",2,2.2,"АКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());
        Car hyundai = new Car("Hyundai","Avante", "Оранжевый", -2016,null,-50,2.2,"АКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());

        Bus liaz = new Bus("LIAZ","Z1","Белый",2022, "Россия",190);
        printOnCar(audi);
        printOnCar(bmw);
        printOnCar(kia);
        printOnCar(hyundai);
        printOnCar(lada);
        printOnBus(liaz);

    }
    public static void printOnCar( Car car){
        System.out.println(car.getBrand() + " "
                + car.getMadel() + " " + car.getYear()
                + " года выпуска, сборка "  +  car.getCountry()
                + " ," + car.getColor() + " цвет " + " объем двигателя "
                + car.getEngineVolume()+" "+
                car.getKorobka() + " " +car.getKuzov() + " " + car.getNumber() + " " +car.getMest() + " " + car.isRezSummer() +
                (car.getKey().isWithoutKeyAccess() ? " Бесключевой доступ": " Ключевой доступ")+
                (car.getKey().isRemoteRunEngine() ? " Удаленный доступ": " Ключевой доступ")+
                " Номер страховки "+ car.getInsurance().getNumber() + " Стоимость страховки " + car.getInsurance().getCost() +
                " Срок действия страховки " + car.getInsurance().getExpireDate() + " максимальная скорость " + car.getMaxSpeed());
    }
    public static void printOnBus(Bus bus){
        System.out.println(bus.getBrand() + " "
                + bus.getMadel() + " " + bus.getYear()
                + " года выпуска, сборка "  +  bus.getCountry()
                + " ," + bus.getColor() + " цвет " +" максимальная скорость " + bus.getMaxSpeed());
    }
}
