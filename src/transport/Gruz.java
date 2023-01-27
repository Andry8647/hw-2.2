package transport;

public enum Gruz {N1(null,5f),
    N2(3.5f,12f),
    N3(12f,null);

    private final Float gruz1;
    private final Float gruz2;

    Gruz(Float gruz1, Float gruz2) {
        this.gruz1 = gruz1;
        this.gruz2 = gruz2;
    }

    public double getGruz1() {
        return gruz1;
    }
    public double getGruz2() {
        return gruz2;
    }
    public String toString() {
        String a;
        if(gruz1 == null){
             a = "Грузоподъемность: \"до "+ gruz2 +" тонн.\"";
        }
        else if(gruz2 == null){
             a = "Грузоподъемность: \"от "+ gruz1 +" тонн.\"";
        }else {
            a = "Грузоподъемность: \" от "+gruz1+" тонн до "+gruz2+" тонн";
        }

        return a;
    }
}
