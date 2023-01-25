import transport.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("LADA","Vesta",2.0);
        Car BMW = new Car("BMW","M5",4.4);
        Car Audi = new Car("Audi","A7",4.0);
        Car Haval = new Car("Haval","H7",2.0);
        Bus MAZ = new Bus("MAZ","A10",5.0);
        Bus Liaz = new Bus("Liaz","50",6.0);
        Bus Man = new Bus("Man","K1",4.0);
        Bus Hyundai = new Bus("Hyundai","50A",8.0);
        BigCar MAN = new BigCar("MAN","H10",4.0);
        BigCar KAMAZ = new BigCar("KAMAZ","L1",4.0);
        BigCar Maz = new BigCar("MAZ","P1",4.0);
        BigCar ZIL = new BigCar("ZIL","D1",4.0);
        lada.pitStop();
        Drivers1 Anton = new Drivers1("антон владимирович бешенов", "C",3);
        Drivers2 Andrei = new Drivers2("Андрей владимирович бешенов", "B",3);
        Drivers3 Artem = new Drivers3("Артем владимирович бешенов", "D",3);
       // Anton.goDo();
        Maz.startMoving();
        Maz.stopMoving();
        lada.pitStop();
        lada.bestSpeed();
        lada.bestTime();
        MAZ.printInfo(Anton);
      KAMAZ.printInfo(Artem);
      BMW.printInfo(Andrei);




//        Car lada = new Car("Lada",null, "Желтый", 2015,"Россия",60,
//                2.2,"MКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());
//      //  lada.setRezSummer(true);
//
//        Car audi = new Car("Audi",null, "Черный", 2020,"Германия",60,2.2,"АКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());
//        Car bmw = new Car("BMW","Z8", "Черный", 2021,"Германия",60,2.2,"АКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());
//        Car kia = new Car("Kia","Sportage 4-го поколения", null, 2018,"Южная Корея",2,2.2,"АКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());
//        Car hyundai = new Car("Hyundai","Avante", "Оранжевый", -2016,null,-50,2.2,"АКПП", "Седан", null, 7, true,new Car.Key(),new Car.Insurance());
//
//        Bus liaz = new Bus("LIAZ","Z1","Белый",2022, "Россия",190);
//        Bus paz = new Bus("PAZ","1","Синий",-5, null,220);
//        Bus maz = new Bus("MAZ","Kartoshka","Картофельный",2022, "Белорусь",100);
//        printOnCar(audi);
//        printOnCar(bmw);
//        printOnCar(kia);
//        printOnCar(hyundai);
//        printOnCar(lada);
//        printOnBus(liaz);
//        printOnBus(paz);
//        printOnBus(maz);
//
//    }
//    public static void printOnCar( Car car){
//        System.out.println(car.getBrand() + " "
//                + car.getMadel() + " " + car.getYear()
//                + " года выпуска, сборка "  +  car.getCountry()
//                + " ," + car.getColor() + " цвет " + " объем двигателя "
//                + car.getEngineVolume()+" "+
//                car.getKorobka() + " " +car.getKuzov() + " " + car.getNumber() + " " +car.getMest() + " " + car.isRezSummer() +
//                (car.getKey().isWithoutKeyAccess() ? " Бесключевой доступ": " Ключевой доступ")+
//                (car.getKey().isRemoteRunEngine() ? " Удаленный доступ": " Ключевой доступ")+
//                " Номер страховки "+ car.getInsurance().getNumber() + " Стоимость страховки " + car.getInsurance().getCost() +
//                " Срок действия страховки " + car.getInsurance().getExpireDate() + " максимальная скорость " + car.getMaxSpeed());
//    }
//    public static void printOnBus(Bus bus){
//        System.out.println(bus.getBrand() + " "
//                + bus.getMadel() + " " + bus.getYear()
//                + " года выпуска, сборка "  +  bus.getCountry()
//                + " ," + bus.getColor() + " цвет " +" максимальная скорость " + bus.getMaxSpeed());
//    }
    }
}
