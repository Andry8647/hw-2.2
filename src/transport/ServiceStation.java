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

    public void addCar(Transport transport)  {

       boolean a = transport instanceof Bus;
//       service1.add(car);
        if(a==true){
            System.out.println("Автобусам нельзя проходить диагностику");
        }else {
            service1.offer(transport);
            System.out.println(transport.getBrand() + " добавлена в очереди ");
        }


    }


    public void removeCar()  {
        service1.poll();
        System.out.println("Машина  прошла диагностику, заехала следующая");


    }
}
