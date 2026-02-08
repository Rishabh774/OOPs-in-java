package Collection_Framework;
//Iterable (I)
//        |
//        Collection (I)
//        __________________________________
//        |          |          |            |
//        List (I)    Set (I)   Queue (I)    Deque (I)
//        |          |          |            |
//        ---------   ---------   ---------   ---------
//        |    |    | |    |    | |    |      |     |
//        ArrayList   HashSet   PriorityQueue   ArrayDeque
//        LinkedList  LinkedHashSet
//        Vector      TreeSet
//        Stack

import java.util.ArrayList;
import java.util.List;
//  methods are of collection framework
public class CollectionList {
    public static void main(String[] args) {

        // List interface ka object, ArrayList implementation ke saath
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // add() → List ke end me element insert karta hai
        list.add(10);
        list.add(1);
        list.add(30);
        list.add(100);

        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);

        // poori list print karega
        System.out.println(list);

        // remove(Object o) → given value ko remove karta hai
        // list.remove(Integer.valueOf(10));

        // remove(int index) → given index par jo element hai use remove karta hai
        // list.remove(1);

        // contains(Object o) → check karta hai element list me present hai ya nahi
        // true ya false return karta hai
        System.out.println(list.contains(30));

        System.out.println(list);

        // addAll(Collection c) → dusri list ke saare elements current list me add karta hai
        // list.addAll(list2);

        // removeAll(Collection c) → current list se wo saare elements hata deta hai
        // jo dusri list me present hain
        // list.removeAll(list2);

        // retainAll(Collection c) → sirf wahi elements rakhta hai
        // jo dono lists me common hote hain
        list.retainAll(list2);

        // final list print
        System.out.println(list);
    }
}
