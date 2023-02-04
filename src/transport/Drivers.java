package transport;

public abstract class Drivers {
    private String name;
    private String prava;
    private int staj;
    public Drivers(String name, String prava, int staj) {
        this.name = name;
        if(prava == null){
            throw new UnsupportedOperationException("Необходимо указать тип прав!");
           }else if (prava.equals("B") || prava.equals("D") || prava.equals("C")){
            this.prava = prava;
        }else {
            throw new UnsupportedOperationException("Права не подходят");
        }
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
