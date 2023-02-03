package transport;

public class Drivers2 extends Drivers{

    public Drivers2(String name, String prava, int staj) {
        super(name,prava,staj);

    }

    @Override
    public void goDo() {
        System.out.println("Водитель категории " + getPrava() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории " + getPrava() + " закончил движение");
    }

    @Override
    public void zapravitAvto() {
        System.out.println("Водитель категории " + getPrava() + " заправляет авто");

    }
}
