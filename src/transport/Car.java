package transport;

import java.util.List;

public class Car  extends Transport<Drivers1> {


    private BodyType bodyTypes;

    public Car(String brand, String model, double engineCapacity, Drivers1 driver, List<Mechanic> mechanic, BodyType bodyTypes) {
        super(brand, model, engineCapacity, driver, mechanic);
        this.bodyTypes = bodyTypes;

    }
    public void printOfVodila()  {
        System.out.println("У водителя " + getDriver().getName() + " есть механики " + getMechanics());

    }

    @Override
    public void pushDiagnostics()  {
        System.out.println("Автомобиль "+ getBrand()+" " + getModel() + "  прошел диагностику");

//        if(getDriver().getPrava() == null){
//            throw new UnsupportedOperationException("Необходимо указать тип прав!");
//        }else if( !getDriver().getPrava().equals("B") ){
//            throw new UnsupportedOperationException("Права не подходят");
//        }else  {
//            System.out.println("Права подходят");

 //       }
    }

    public BodyType getBodyTypes(){

        return bodyTypes;
    }

    public void setBodyTypes(BodyType bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    @Override
    public void startMoving(){
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");
    }
    @Override
    public void stopMoving(){
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение");
    }


    @Override
    public void printType() {
        if (getBodyTypes() != null) {
            System.out.println(getBodyTypes().toString());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }



    @Override
    public void pitStop() {
        System.out.println("Пит-Стоп у автомобиля");
    }
    @Override
    public void bestTime() {
        int minSpeed = 20;
        int maxSdeep = 30;
        int speed = (int) (minSpeed + (maxSdeep-minSpeed)*Math.random());
        System.out.println("Лучшее время круга у автомобиля" +speed);
    }

    @Override
    public void bestSpeed() {
        int minSpeed = 200;
        int maxSdeep = 270;
        int speed = (int) (minSpeed + (maxSdeep-minSpeed)*Math.random());
        System.out.println("Максимальная скорость у автомобиля" +speed);
    }

}
    //    private double engineVolume;
//    private String korobka;
//    private final  String kuzov;
//    private String number;
//    private final int mest;
//    private boolean rezSummer;
//    private Key key;
//    private Insurance insurance;


//    public Car(String brand,
//               String madel,
//               String color,
//               int year,
//               String country,
//               int maxSpeed,
//               double engineVolume,
//               String korobka,
//               String kuzov,
//               String number,
//               int mest,
//               boolean rezSummer,
//               Key key,
//               Insurance insurance) {
//        super(brand, madel, color, year, country, maxSpeed);
//
//        if(engineVolume>0){
//            this.engineVolume =engineVolume;
//        }else {
//            this.engineVolume = 1.5;
//        }
//        if (korobka!=null){
//            this.korobka = korobka;
//        }else {
//            this.korobka = "МКПП";
//        }
//        if (kuzov!=null){
//            this.kuzov = kuzov;
//        }else {
//            this.kuzov = "седан";
//        }
//        if (number!=null){
//            this.number = number;
//        }else {
//            this.number = "X000XX152";
//        }
//        if(key == null){
//            this.key = new Key();
//        }else {
//            this.key = key;
//        }
//        if(insurance == null){
//            this.insurance = new Insurance();
//        }else {
//            this.insurance = insurance;
//        }
//        this.mest = mest;
//        this.rezSummer = rezSummer;
//    }
//
//    public Insurance getInsurance() {
//        return insurance;
//    }
//
//    public void setInsurance(Insurance insurance) {
//        this.insurance = insurance;
//    }
//
//    public Key getKey() {
//        return key;
//    }
//
//    public void setKey(Key key) {
//        this.key = key;
//    }
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        this.engineVolume = engineVolume;
//    }
//
//
//
//    public String getKorobka() {
//        return korobka;
//    }
//
//    public void setKorobka(String korobka) {
//        if(this.korobka == null){
//            this.korobka = "МКПП";
//        }else {
//            this.korobka = korobka;
//        }
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String number) {
//        if(this.number == null){
//            this.number = "X000XX152";
//        }else {
//            this.number = number;
//        }
//    }
//
//    public boolean isRezSummer() {
//        return rezSummer;
//    }
//
//    public void setRezSummer(boolean rezSummer) {
//        this.rezSummer = rezSummer;
//    }
//
//
//    public String getKuzov() {
//        return kuzov;
//    }
//
//    public int getMest() {
//        return mest;
//    }
//    public void changeSummerRez(){
//        rezSummer = !rezSummer;
//    }
//    public boolean carNumber(){
//        if(number.length()!=9){
//            return false;
//
//        }
//        char[] chars = number.toCharArray();
//        if(!Character.isAlphabetic(chars[0])||!Character.isAlphabetic(chars[4])||!Character.isAlphabetic(chars[5])){
//            return false;
//        }
//        if(!Character.isDigit(chars[1]) ||!Character.isDigit(chars[2]) ||!Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) ||!Character.isDigit(chars[7]) ||!Character.isDigit(chars[8]) ){
//            return false;
//        }
//        return true;
//    }
//    public static class Key{
//        private final boolean remoteRunEngine;
//        private final boolean withoutKeyAccess;
//        public Key(boolean remoteRunEngine, boolean withoutKeyAccess){
//            this.remoteRunEngine = remoteRunEngine;
//            this.withoutKeyAccess = withoutKeyAccess;
//        }
//        public Key(){
//            this(false,false);
//        }
//
//        public boolean isRemoteRunEngine() {
//            return remoteRunEngine;
//        }
//
//        public boolean isWithoutKeyAccess() {
//            return withoutKeyAccess;
//        }
//    }
//    public static class Insurance {
//        private final LocalDate expireDate;
//        private final double cost;
//        private final String number;
//
//        public Insurance(LocalDate expireDate, double cost, String number) {
//            if (expireDate == null) {
//                this.expireDate = LocalDate.now().plusDays(365);
//            } else {
//                this.expireDate = expireDate;
//            }
//
//            this.cost = cost;
//            if (number == null) {
//                this.number = "123456789";
//            } else {
//                this.number = number;
//            }
//        }
//        public Insurance(){
//            this(null,10000,null);
//        }
//
//        public LocalDate getExpireDate() {
//            return expireDate;
//        }
//
//        public double getCost() {
//            return cost;
//        }
//
//        public String getNumber() {
//            return number;
//        }
//        public void checkExpireDate(){
//            if(expireDate.isBefore(LocalDate.now())|| expireDate.isEqual(LocalDate.now())){
//                System.out.println("Нужно оформить новую страховку");
//            }
//        }
//        public void checkNumber(){
//            if(number.length()!=9){
//                System.out.println("Номер страховки не корректный");
//            }
//        }
  //  }


