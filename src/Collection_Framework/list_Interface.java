package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class list_Interface {
    public static void main(String[] args) {

        // ===================== ARRAYLIST =====================
        // List interface ka object, ArrayList implementation ke saath
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);   // duplicate allowed

        System.out.println("ArrayList: " + list);

        System.out.println(list.get(2));   // index based access

        list.add(20);
        list.add(2, 100);   // insert at index
        list.set(4, 200);   // replace element

        System.out.println(list.indexOf(40));
        System.out.println(list.lastIndexOf(40));

        System.out.println("Updated ArrayList: " + list);


        // ===================== LINKEDLIST =====================
        /*
         * LinkedList → Doubly Linked List hoti hai
         * Fast insertion & deletion
         */
        LinkedList<String> linkedList = new LinkedList<>();

        // add() → element add karta hai
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        // addFirst() → starting me element add
        linkedList.addFirst("HTML");

        // addLast() → end me element add
        linkedList.addLast("JavaScript");

        // getFirst() → first element return
        System.out.println("First Element: " + linkedList.getFirst());

        // getLast() → last element return
        System.out.println("Last Element: " + linkedList.getLast());

        // removeFirst() → first element remove
        linkedList.removeFirst();

        System.out.println("LinkedList: " + linkedList);


        // ===================== VECTOR =====================
        /*
         * Vector → synchronized (thread-safe)
         * Legacy class, slow compared to ArrayList
         */
        Vector<Integer> vector = new Vector<>();

        // add() → element add
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // addElement() → legacy method (same as add)
        vector.addElement(40);

        // capacity() → current capacity return karta hai
        System.out.println("Vector Capacity: " + vector.capacity());

        // size() → total elements
        System.out.println("Vector Size: " + vector.size());

        System.out.println("Vector: " + vector);


        // ===================== STACK =====================
        /*
         * Stack → LIFO (Last In First Out)
         * push(), pop(), peek()
         */
        Stack<String> stack = new Stack<>();

        // push() → element insert karta hai
        stack.push("Book");
        stack.push("Pen");
        stack.push("Notebook");

        System.out.println("Stack: " + stack);

        // peek() → top element return karta hai (remove nahi karta)
        System.out.println("Top Element: " + stack.peek());

        // pop() → top element remove + return
        System.out.println("Removed Element: " + stack.pop());

        // search() → element ki position batata hai (1-based)
        System.out.println("Position of Book: " + stack.search("Book"));

        System.out.println("Final Stack: " + stack);


        // ===================== ITERATOR EXAMPLE =====================
        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Pineapple");

        Iterator<String> fe = list2.iterator();

        while (fe.hasNext()) {
            System.out.println("Iterator Element: " + fe.next());
        }
    }
}
