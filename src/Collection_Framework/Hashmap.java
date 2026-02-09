package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {

        // ===================== HASHMAP =====================
        /*
         * HashMap → part of Java Collection Framework
         * Stores data in (key, value) pair
         * Duplicate keys ❌ allowed nahi
         * Duplicate values ✅ allowed
         * Order maintain ❌ nahi hota
         * Allows ONE null key & multiple null values
         */

        HashMap<Integer, String> map = new HashMap<>();

        // ----------------- put() -----------------
        // put(key, value) → data insert karta hai
        // Time Complexity: O(1)
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");
        map.put(104, "JavaScript");
        map.put(105, "Java");   // duplicate value allowed

        System.out.println("HashMap: " + map);

        // ----------------- get() -----------------
        // get(key) → key se value return karta hai
        // Time Complexity: O(1)
        System.out.println("Value of key 102: " + map.get(102));

        // ----------------- containsKey() -----------------
        // key present hai ya nahi check karta hai
        // Time Complexity: O(1)
        System.out.println("Contains key 103? " + map.containsKey(103));

        // ----------------- containsValue() -----------------
        // value present hai ya nahi check karta hai
        // Time Complexity: O(n)
        System.out.println("Contains value Java? " + map.containsValue("Java"));

        // ----------------- remove() -----------------
        // remove(key) → key-value pair remove karta hai
        // Time Complexity: O(1)
        map.remove(104);
        System.out.println("After removing key 104: " + map);

        // ----------------- size() -----------------
        // total key-value pairs count karta hai
        // Time Complexity: O(1)
        System.out.println("Size: " + map.size());

        // ----------------- isEmpty() -----------------
        // map empty hai ya nahi
        // Time Complexity: O(1)
        System.out.println("Is Empty? " + map.isEmpty());

        // ----------------- keySet() -----------------
        // sirf keys return karta hai
        // Time Complexity: O(n)
        System.out.println("Keys: " + map.keySet());

        // ----------------- values() -----------------
        // sirf values return karta hai
        // Time Complexity: O(n)
        System.out.println("Values: " + map.values());

        // ----------------- entrySet() -----------------
        // key + value dono return karta hai
        // Time Complexity: O(n)
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ----------------- clear() -----------------
        // saara data remove kar deta hai
        // Time Complexity: O(n)
        map.clear();
        System.out.println("After clear(): " + map);
    }
}
