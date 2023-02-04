import transport.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ServiceStation serviceStation = new ServiceStation();

        ArrayList<Transport> cars = new ArrayList<>();
        List<Drivers> drivers = new ArrayList<>();
        Map<Transport,Mechanic> mechanics = new HashMap<>();


        Mechanic Antony = new Mechanic("Антони Феррари","Феррари");
        Mechanic Berlytony = new Mechanic("Берлутони Франческо","Бугатти");
        Mechanic Vlad = new Mechanic("Влад","Бугатти");
        Mechanic Ignat = new Mechanic("Игнат","Бугатти");
        Mechanic Oleg = new Mechanic("Олег","Бугатти");
        Mechanic Petya = new Mechanic("Петя","Бугатти");
        Mechanic Lika = new Mechanic("Лика","Бугатти");
        Mechanic Zara = new Mechanic("Зара","Бугатти");
        Mechanic Rita = new Mechanic("Рита","Бугатти");
        Mechanic Olesa = new Mechanic("Олеся","Бугатти");
        Mechanic Islam = new Mechanic("Ислам","Бугатти");
        Mechanic Mario = new Mechanic("Марио","Бугатти");

        Drivers1 Anton = new Drivers1("Антон", "B",3);
        Drivers2 Andrei = new Drivers2("Андрей ", "C",3);
        Drivers3 Artem = new Drivers3("Артем ", "D",3);
       // Anton.goDo();
        Car lada = new Car("LADA","Vesta",2.0,Anton,mechanics, BodyType.KUPE);
        Car BMW = new Car("BMW","M5",4.4,Anton,mechanics,BodyType.SEDAN);
        Car Audi = new Car("Audi","A7",4.0,Anton,mechanics, BodyType.KROSSOVER);
        Car Haval = new Car("Haval","H7",2.0,Anton, mechanics,null);
        Bus MAZ = new Bus("MAZ","A10",5.0,Andrei,mechanics,BusVmestimost.BIG);
        Bus Liaz = new Bus("Liaz","50",6.0,Andrei,mechanics, BusVmestimost.MIN);
        Bus Man = new Bus("Man","K1",4.0,Andrei, mechanics,BusVmestimost.VERYMIN);
        Bus Hyundai = new Bus("Hyundai","50A",8.0,Andrei,mechanics, null);
        BigCar MAN = new BigCar("MAN","H10",4.0,Artem,mechanics,Gruz.N1);
        BigCar KAMAZ = new BigCar("KAMAZ","L1",4.0,Artem,mechanics, Gruz.N2);
        BigCar Maz = new BigCar("MAZ","P1",4.0,Artem,mechanics, Gruz.N3);
        BigCar ZIL = new BigCar("ZIL","D1",4.0,Artem, mechanics,null);




//        serviceStation.addCar(lada);
//        serviceStation.addCar(Audi);
//        serviceStation.removeCar();
//        serviceStation.kolCar();




        mechanics.put(lada,Antony);
        mechanics.put(Audi,Berlytony);
        mechanics.put(BMW,Oleg);
        mechanics.put(MAN,Vlad);
        mechanics.put(Man,Olesa);
        mechanics.put(MAZ,Ignat);
        mechanics.put(Maz,Islam);
        mechanics.put(Hyundai,Petya);
        mechanics.put(Haval,Mario);
        mechanics.put(KAMAZ,Rita);
        mechanics.put(Liaz,Zara);
        mechanics.put(ZIL,Lika);




        System.out.println(mechanics.get(BMW).getNameAndSurname());

        drivers.add(Anton);
        drivers.add(Andrei);
        drivers.add(Artem);


        cars.add(lada);
        cars.add(BMW);
        cars.add(Audi);
        cars.add(Haval);
        cars.add(Maz);
        cars.add(MAZ);
        cars.add(Liaz);
        cars.add(Man);
        cars.add(Hyundai);
        cars.add(MAN);
        cars.add(KAMAZ);
        cars.add(ZIL);

//        System.out.println(mechanics.get(lada).getNameAndSurname());
        printOfVodila(lada);
        printOfVodila(Audi);
        printOfVodila(MAN);
        printOfVodila(Man);
        printOfVodila(Liaz);
        printOfVodila(lada);

//        Audi.printType();
//
//        passDiagnostics(lada);
 //       passDiagnostics(Maz);


   //     Transport.passDiagnostics(lada,Audi,Liaz);






//       printInfo(lada);
//       lada.printType();
//
//       MAN.printType();
//       ZIL.printType();
//       BMW.printType();
//       Hyundai.printType();
//       Haval.printType();
//       KAMAZ.printType();
//       Maz.printType();
//       MAZ.printType();
//       Man.printType();
//        printInfo(BMW);
//        printInfo(Audi);
//        printInfo(Haval);
//        printInfo(MAZ);
//        printInfo(Liaz);
//        printInfo(Man);
//        printInfo(Hyundai);
//        printInfo(MAN);
//        printInfo(KAMAZ);
//        printInfo(Maz);
//        printInfo(ZIL);







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


    public static void passDiagnostics(Transport... transports){
        for (Transport transport: transports) {
            try{
                transport.passDiagnostics();
            }catch (UnsupportedOperationException e){
                System.out.println(e.getMessage());
            }
        }
    }
    private static void printOfVodila(Transport<?> transport) {

        System.out.println("У автомобиля " + transport.getBrand() + " есть механики " + transport.getMechanics().get(transport).getNameAndSurname());

    }
    private static void printService(Transport<?> transport) {

    }

    private static void printInfo(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getName() +" c правами категории  "+ transport.getDriver().getPrava() + " управляет автомобилем " + transport.getBrand() + " и будет учавствовать в заезде с механиками " + transport.getMechanics().get(0).getNameAndSurname() + " и " + transport.getMechanics().get(1).getNameAndSurname());
    }
}
