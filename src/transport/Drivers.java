package transport;

public class Drivers {
    private String name;
    private String prava;
    private int staj;

    public void goDo() {
        System.out.println("Начать движение");
    }
    public void stop() {
        System.out.println("остановиться");
    }
    public void zapravitAvto() {
        System.out.println("заправить авто");
    }
    public Drivers(String name, String prava, int staj) {
        this.name = name;
        this.prava = prava;
        this.staj = staj;
    }


    public String getName() {
        return name;
    }

    public String getPrava() {
        return prava;
    }

    public void setPrava() {
        this.prava = prava;
    }

    public int getStaj() {
        return staj;
    }

    public void setStaj(int staj) {
        this.staj = staj;
    }
}
