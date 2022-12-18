public class Car {
    String brand;
    String madel;
    double engineVolume;
    String color;
    int year;
    String country;
    Car(String brand, String madel, double engineVolume, String color, int year, String country){
        this.brand = brand;
        this.madel = madel;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    void printCar(){
        System.out.println(brand + " " + madel + " " + year + " года выпуска, сборка "  +  country + " ," + color + " цвет " + " объем двигателя " + engineVolume);
    }
}
