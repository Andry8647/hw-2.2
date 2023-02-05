package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceStation {
    List<Transport> service = new ArrayList<>();
    public void kolCar()  {
        for (int i = 0; i < service.size(); i++) {
            System.out.println(service.get(i).getBrand() + " в очереди ");
        }

    }

    public void addCar(Transport car)  {
       service.add(car);

            System.out.println(car.getBrand() + " добавлена в очереди ");

    }
    public void removeCar()  {

        service.remove(0);
        System.out.println("Провести тех обслуживание");
        System.out.println("Машина прошла диагностику, заехала следующая");
    }
}
