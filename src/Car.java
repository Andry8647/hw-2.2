import java.lang.invoke.StringConcatException;

public class Car {
    String brand;
    String madel;
    double engineVolume;
    String color;
    int year;
    String country;
    Car(String brand){
        this(brand,"default");
    }
    Car(String brand,String madel){
        this(brand,madel,1.5);
    }
    Car(String brand,String madel, double engineVolume){
        this(brand,madel,engineVolume,"Белый");

    }
    Car(String brand,String madel,double engineVolume,String color){
        this(brand,madel,engineVolume,color,2000);
    }
    Car(String brand, String madel, double engineVolume, String color, int year){
        this(brand,madel,engineVolume,color,year,"default");
    }

    Car(String brand, String madel, double engineVolume, String color, int year, String country){
        if (brand != null){
        this.brand = brand;
        }else {
            this.brand = "default";
        }
        if(madel!= null){
            this.madel = madel;
        }else {
            this.madel = "default";
        }
        if(engineVolume>0){
            this.engineVolume =engineVolume;
        }else {
            this.engineVolume = 1.5;
        }
        if(color!=null){
            this.color = color;
        }else {
            this.color = "Белый";
        }
        if (year>0){
            this.year = year;
        }else {
            this.year = 2000;
        }
        if (country!=null){
            this.country = country;
        }else {
            this.country = "default";
        }
    }

    void printCar(){
        System.out.println(brand + " " + madel + " " + year + " года выпуска, сборка "  +  country + " ," + color + " цвет " + " объем двигателя " + engineVolume);
    }
}
