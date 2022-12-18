public class Main {
    public static void main(String[] args){
        Car lada = new Car(null,"Granta",1.7, "Желтый", 2015,"Россия");
        Car audi = new Car("Audi",null,3.0, "Черный", 2020,"Германия");
        Car bmw = new Car("BMW","Z8",-3.0, "Черный", 2021,"Германия");
        Car kia = new Car("Kia","Sportage 4-го поколения",2.4, null, 2018,"Южная Корея");
        Car hyundai = new Car("Hyundai","Avante",1.6, "Оранжевый", -2016,null);
        lada.printCar();
        audi.printCar();
        bmw.printCar();
        kia.printCar();
        hyundai.printCar();

    }
}
