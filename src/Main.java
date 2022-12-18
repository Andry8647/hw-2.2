public class Main {
    public static void main(String[] args){
        Car lada = new Car();
        lada.brand = "Lada";
        lada.madel = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "Желтый";
        lada.year = 2015;
        lada.country = "Россия";
        Car audi = new Car();
        audi.brand = "Audi";
        audi.madel = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "Черный";
        audi.year = 2020;
        audi.country = "Германия";
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.madel = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "Черный";
        bmw.year = 2021;
        bmw.country = "Германия";
        Car kia = new Car();
        kia.brand = "Kia";
        kia.madel = "Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "Красный";
        kia.year = 2018;
        kia.country = "Южная Корея";
        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.madel = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "Оранжевый";
        hyundai.year = 2016;
        hyundai.country = "Южная Корея";
        lada.printCar();
        audi.printCar();
        bmw.printCar();
        kia.printCar();
        hyundai.printCar();

    }
}
