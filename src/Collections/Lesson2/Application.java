package Collections.Lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Honda", "Accord", 12_000, false));
        vehicles.add(new Vehicle("Toyota", "Camry", 34_000, false));
        vehicles.add(new Vehicle("Jeep", "Wrangler", 13_000, true));

        printElements(animals);
        printElements(vehicles);

    }

    public static void printElements(List list){
        for (Object item : list) {
            System.out.println(item);
            System.out.println();
        }
    }
}
