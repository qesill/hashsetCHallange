import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
         /*
           1. Stwórz HashSet z typem String i dodaj do niego następujące imiona:
              Ola, Kasia, Daniel, Ola, Kasia, Adam. Na koniec wyświetl wszystkie elementy
              w konsoli.
           2. Dodaj klasę Car z polem name typu String oraz konstruktorem,
              getterem, setterem i metodą toString().
              Stwórz HashSet z typem Car i dodaj dwa razy tą samą instancję dla 3 nazw
              aut: "Dodge", "Citroen", "Opel". Wyświetl rezultat w konsoli.
         */

        HashSet<String> set = new HashSet<>();
        set.add("Ola");
        set.add("Kasia");
        set.add("Daniel");
        set.add("Ola");
        set.add("Kasia");
        set.add("Adam");


Iterator <String> iterator = set.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
        }

HashSet<Car> cars = new HashSet<>();
cars.add(new Car("Porshe"));
cars.add(new Car("Ford"));
cars.add(new Car("Pontiac"));
cars.add(new Car("Porshe"));
Car car1 = new Car("Dodge");
cars.add(car1);
cars.add(car1);
Car car2 = new Car("Citroen");
cars.add(car2);
cars.add(car2);
Car car3 = new Car("Opel");
cars.add(car3);
cars.add(car3);

        System.out.println("\nSamochody:");
Iterator<Car> carIterator = cars.iterator();
while (carIterator.hasNext()) {
    Car car = carIterator.next();
    System.out.println(car.getName());
}
    }
}
