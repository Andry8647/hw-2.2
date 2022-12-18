public class Car {
    String brand;
    String madel;
    double engineVolume;
    String color;
    int year;
    String country;

    void printCar(){
        System.out.println(brand + " " + madel + " " + year + " года выпуска, сборка "  +  country + " ," + color + " цвет " + " объем двигателя " + engineVolume);
    }
}
