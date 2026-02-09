package Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {
    public static void main(String[] args) {

        // ===================== HASHSET =====================
        /*
         * HashSet
         * - Unordered
         * - No duplicates
         * - Uses Hashing
         *
         * Time Complexity (Average Case):
         * add()        -> O(1)
         * remove()     -> O(1)
         * contains()   -> O(1)
         * size()       -> O(1)
         * isEmpty()    -> O(1)
         * iterator()   -> O(n)
         * clear()      -> O(n)
         * toArray()    -> O(n)
         */
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(10);      // O(1)
        hashSet.add(20);      // O(1)
        hashSet.add(30);      // O(1)
        hashSet.add(40);      // O(1)
        hashSet.add(40);      // duplicate ignored

        System.out.println("HashSet Size: " + hashSet.size()); // O(1)
        System.out.println("Contains 30? " + hashSet.contains(30)); // O(1)

        hashSet.remove(20);   // O(1)
        System.out.println("Is Empty? " + hashSet.isEmpty()); // O(1)

        System.out.print("HashSet Elements: ");
        for (Integer i : hashSet) {          // O(n)
            System.out.print(i + " ");
        }
        System.out.println();

        Object[] hsArr = hashSet.toArray();  // O(n)
        System.out.println("HashSet Array Length: " + hsArr.length);


        // ===================== LINKEDHASHSET =====================
        /*
         * LinkedHashSet
         * - Insertion order maintained
         * - No duplicates
         * - HashTable + Doubly Linked List
         *
         * Time Complexity:
         * add()        -> O(1)
         * remove()     -> O(1)
         * contains()   -> O(1)
         * size()       -> O(1)
         * isEmpty()    -> O(1)
         * iterator()   -> O(n)
         * clear()      -> O(n)
         * addAll()     -> O(n)
         */
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Java");    // O(1)
        linkedHashSet.add("Python");  // O(1)
        linkedHashSet.add("C++");     // O(1)
        linkedHashSet.add("Java");    // duplicate ignored

        System.out.println("LinkedHashSet Size: " + linkedHashSet.size()); // O(1)
        System.out.println("Contains Python? " + linkedHashSet.contains("Python")); // O(1)

        linkedHashSet.remove("C++");  // O(1)
        System.out.println("Is Empty? " + linkedHashSet.isEmpty()); // O(1)

        System.out.println("LinkedHashSet Elements: " + linkedHashSet); // O(n)


        // ===================== TREESET =====================
        /*
         * TreeSet
         * - Sorted order
         * - No duplicates
         * - Uses Red-Black Tree
         *
         * Time Complexity:
         * add()        -> O(log n)
         * remove()     -> O(log n)
         * contains()   -> O(log n)
         * first()      -> O(log n)
         * last()       -> O(log n)
         * higher()     -> O(log n)
         * lower()      -> O(log n)
         * pollFirst()  -> O(log n)
         * pollLast()   -> O(log n)
         * iterator()   -> O(n)
         */
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);   // O(log n)
        treeSet.add(10);   // O(log n)
        treeSet.add(30);   // O(log n)
        treeSet.add(20);   // O(log n)
        treeSet.add(40);   // O(log n)

        System.out.println("First: " + treeSet.first());   // O(log n)
        System.out.println("Last: " + treeSet.last());     // O(log n)
        System.out.println("Higher than 20: " + treeSet.higher(20)); // O(log n)
        System.out.println("Lower than 30: " + treeSet.lower(30));   // O(log n)

        System.out.println("Removed First: " + treeSet.pollFirst()); // O(log n)
        System.out.println("Removed Last: " + treeSet.pollLast());   // O(log n)

        System.out.println("Contains 30? " + treeSet.contains(30));  // O(log n)
        System.out.println("Final TreeSet: " + treeSet);
    }
}
