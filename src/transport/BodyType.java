package transport;

public enum BodyType {SEDAN("Седан!"),
    XETCH("Хетчбек!"),
    KUPE("Купе!"),
    YNIVERSAL("Универсал!"),
    VNEDOROJ("Внедорожник!"),
    KROSSOVER("Кроссовер!"),
    PICUP("Пикап!"),
    FURGON("Фургон!"),
    MINIVEN("Минивэн!");

    private final String kuzov;

    BodyType(String kuzov) {
        this.kuzov = kuzov;
    }

    public String getKuzov() {
        return kuzov;
    }
    @Override
    public String toString() {
        return "Type{" +
                "Тип кузова " + getKuzov() + '\'' +
                '}';
    }

}
