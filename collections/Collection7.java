//set - internally uses hashmap
//set.add(1) = put(1) in hashmap 1 is used as the key and val is a dummy obj that is stored

import java.util.*;

public class Collection7 {

    public static void main(String[] args) {

        // Creating HashSet
        Set<Integer> set1 = new HashSet<>();


        // 1. add()
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        // HashSet does not allow duplicates
        set1.add(10);

        System.out.println("After add: " + set1);


        // 2. size()
        System.out.println("Size: " + set1.size());


        // 3. isEmpty()
        System.out.println("Is set empty? " + set1.isEmpty());


        // 4. contains()
        System.out.println("Contains 20? " + set1.contains(20));
        System.out.println("Contains 50? " + set1.contains(50));


        // 5. remove()
        set1.remove(30);

        System.out.println("After removing 30: " + set1);


        // 6. addAll()
        Set<Integer> set2 = new HashSet<>();

        set2.add(40);
        set2.add(50);
        set2.add(60);

        set1.addAll(set2);

        System.out.println("After addAll: " + set1);


        // 7. containsAll()
        System.out.println(
                "Contains all elements of set2? "
                + set1.containsAll(set2)
        );


        // 8. removeAll()
        set1.removeAll(set2);

        System.out.println("After removeAll(set2): " + set1);


        // Add elements again for remaining operations
        set1.add(40);
        set1.add(50);
        set1.add(60);


        // 9. retainAll()
        Set<Integer> set3 = new HashSet<>();

        set3.add(20);
        set3.add(40);
        set3.add(100);

        set1.retainAll(set3);

        System.out.println("After retainAll(set3): " + set1);


        // Add some elements again
        set1.add(50);
        set1.add(60);


        // 10. iterator()
        System.out.println("Using iterator:");

        Iterator<Integer> iterator = set1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // 11. forEach()
        System.out.println("Using forEach:");

        set1.forEach((Integer val) -> System.out.println(val););


        // 12. toArray()
        Object[] arr = set1.toArray();

        System.out.println("Array:");

        for (Object val : arr) {
            System.out.println(val);
        }


        // 13. clear()
        set1.clear();

        System.out.println("After clear: " + set1);


        // 14. isEmpty() after clear
        System.out.println(
                "Is set empty after clear? "
                + set1.isEmpty()
        );
    }
}