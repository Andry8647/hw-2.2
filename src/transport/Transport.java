package transport;

public abstract class  Transport<T extends Drivers> implements Competing{
private final String brand;
private final String model;
private double engineCapacity;
private T driver;

    public Transport(String brand, String model, double engineCapacity, T driver) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineCapacity < 0) {
            this.engineCapacity = 1.6;
        } else {
            this.engineCapacity = engineCapacity;
        }
        setDriver(driver);

    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
    public abstract void  startMoving();

    public abstract void stopMoving();


    //    private  String brand;
//    private  String madel;
//    private  int year;
//    private  String country;
//    private  String color;
//    private  int maxSpeed;
//
//    public Transport(String brand, String madel,String color, int year, String country,  int maxSpeed) {
//        if (brand != null){
//            this.brand = brand;
//        }else {
//            this.brand = "default";
//        }
//        if(madel!= null){
//            this.madel = madel;
//        }else {
//            this.madel = "default";
//        }
//        if(color!=null){
//            this.color = color;
//        }else {
//            this.color = "Белый";
//        }
//        if (year>0){
//            this.year = year;
//        }else {
//            this.year = 2000;
//        }
//        if (country!=null){
//            this.country = country;
//        }else {
//            this.country = "default";
//        }
//        if (maxSpeed > 0){
//            this.maxSpeed = maxSpeed;
//        }else {
//            this.maxSpeed = maxSpeed;
//        }
//    }
//    public  String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public  int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public  String getMadel() {
//        return madel;
//    }
//
//    public void setMadel(String madel) {
//        this.madel = madel;
//    }
//
//    public  int getYear() {
//        return year;
//    }
//
//    public  String getCountry() {
//        return country;
//    }
}
