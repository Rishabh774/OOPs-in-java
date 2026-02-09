package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {
    static class MyCustomComparator implements Comparator<Animal> {

        @Override
        public int compare(Animal a1, Animal a2) {
            //return a1.weight - a2.weight;
            // ascending by weight can cause integer overflow
            return Integer.compare(a1.weight,a2.weight);
        }
    }
    public static void main(String[] args) {

        Animal a3 = new Animal("Kallu",30,10);
        Animal a4 = new Animal("Maiku",40,15);
        Animal a1 = new Animal("Sheru",10,5);
        Animal a2 = new Animal("Dogesh",20,8);
        List<Animal> dogs =new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);
        Collections.sort(dogs, new MyCustomComparator());
        System.out.println("Sorted by Weight (Comparator):");
        System.out.println(dogs);
    }
}
