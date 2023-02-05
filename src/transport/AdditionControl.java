package transport;

import java.util.*;

public class AdditionControl {
     Map<Transport,Mechanic> mechanics = new HashMap<>();
     Set<Drivers> driver = new HashSet<>() ;

    public void addMech(Transport transport, Mechanic mechanic) {

               mechanics.put(transport,mechanic);
            System.out.println("К машине " + transport.getBrand() + " добавлен механик " + mechanic.getNameAndSurname() + " из компании " + mechanic.getCompany());

    }
    public void addDriver(Drivers as) {
        driver.add(as);
        System.out.println(as.getName() + " водитель добавлен");

//            for (String name: phoneBook.keySet()) {
//                System.out.println("В мапе присутствует контакт по имени " + name);
//            }

    }
    public void allDriver( ) {


        Iterator<Drivers> iter = driver.iterator();
        System.out.println("Список водителей:");
        while (iter.hasNext()) {
            Drivers next = iter.next();
            System.out.println(next.getName());
//            for (String name: phoneBook.keySet()) {
//                System.out.println("В мапе присутствует контакт по имени " + name);
//            }

        }
    }
}
