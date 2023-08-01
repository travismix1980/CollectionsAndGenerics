package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("there");

        String item1 = words.get(0);
        String item2 = words.get(1);
        System.out.println(item1);
        System.out.println(item2);

        LinkedList<Integer> numbers = new LinkedList<Integer>(); // no primitive types
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);

        for(int number : numbers){
            System.out.println(number);
        }

        numbers.remove(2);

        for(int number : numbers){
            System.out.println(number);
        }

        System.out.println(numbers.remove());
    }
}
