package Collection_Framework;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class Queue_Interface {
    public static void main(String[] args) {

        // ===================== QUEUE using LinkedList =====================
        /*
         * Queue → FIFO (First In First Out)
         * LinkedList Queue interface ko implement karta hai
         */
        Queue<Integer> q1 = new LinkedList<>();

        // add() → element add karta hai (exception if fails)
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);

        System.out.println("Queue (LinkedList): " + q1);

        // peek() → front element return karta hai (remove nahi karta)
        System.out.println("Front Element (peek): " + q1.peek());

        // poll() → front element remove + return karta hai
        System.out.println("Removed Element (poll): " + q1.poll());

        System.out.println("After poll: " + q1);


        // ===================== PRIORITY QUEUE =====================
        /*
         * PriorityQueue → elements priority ke basis par process hote hain
         * FIFO strictly follow nahi karta
         */
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        System.out.println("PriorityQueue: " + pq);

        // poll() → highest priority (smallest element) remove hota hai
        System.out.println("Removed Element (poll): " + pq.poll());

        System.out.println("After poll: " + pq);


        // ===================== ARRAY DEQUE =====================
        /*
         * ArrayDeque → Fastest Queue implementation
         * Null elements allow nahi karta
         */
        Queue<String> dq = new ArrayDeque<>();

        // offer() → element add karta hai (safe method)
        dq.offer("Apple");
        dq.offer("Banana");
        dq.offer("Orange");

        System.out.println("ArrayDeque Queue: " + dq);

        // element() → front element return karta hai (exception if empty)
        System.out.println("Front Element (element): " + dq.element());

        // remove() → front element remove karta hai (exception if empty)
        System.out.println("Removed Element (remove): " + dq.remove());

        System.out.println("Final Queue: " + dq);
    }
}
