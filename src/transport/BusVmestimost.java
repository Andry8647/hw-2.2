package transport;

public enum BusVmestimost {VERYMIN(null,10),
    MIN(15,25),
    SRED(40,50),
    BIG(60,80),
    VERYBIG(100,120),;

    private final Integer mest1;
    private final Integer mest2;

    BusVmestimost(Integer mest1, Integer mest2) {
        this.mest1 = mest1;
        this.mest2 = mest2;
    }

    public double getMest1() {
        return mest1;
    }
    public double getMest2() {
        return mest2;
    }
    @Override
    public String toString() {
        String a;
        if(mest1 == null){
            a = "Вместимость: \"до "+ mest2 +" человек.\"";
        }
        else if(mest2 == null){
            a = "Вместимость: \"от "+ mest1 +" человек.\"";
        }else {
            a = "Вместимость: \" от "+mest1+" человек до "+mest2+" человек";
        }

        return a;
    }
}
