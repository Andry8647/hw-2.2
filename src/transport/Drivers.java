package transport;

public abstract class Drivers {
    private String name;
    private String prava;
    private int staj;
    public Drivers(String name, String prava, int staj) {
        this.name = name;
        this.prava = prava;
        this.staj = staj;
    }

    public abstract void goDo();

    public abstract void stop();
    public  abstract void zapravitAvto();



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
