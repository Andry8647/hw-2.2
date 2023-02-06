package transport;

import java.util.*;

public class ServiceStation {

  private   Queue service1 = new LinkedList();
//    List<Transport> service = new ArrayList<>();
    public void kolCar()  {

        while ( service1.poll() != null) {
            System.out.println(service1.poll());
        }
//        for (int i = 0; i < service1.size(); i++) {
////            System.out.println(service1.get(i).getBrand() + " в очереди ");
//        }

    }

    public void addCar(Car car)  {

//       service1.add(car);
       service1.offer(car);

            System.out.println(car.getBrand() + " добавлена в очереди ");

    }
    public void addBig(BigCar bigCar)  {

//            service1.add(bigCar);
        service1.offer(bigCar);

        System.out.println(bigCar.getBrand() + " добавлена в очереди ");

    }

    public void removeCar()  {
        service1.poll();
        System.out.println("Машина  прошла диагностику, заехала следующая");


    }
}
