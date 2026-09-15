import java.util.*;

public class Collection6 {

    public static void main(String[] args) {

        Map<Integer, String> rollNameMap = new HashMap<>();

        rollNameMap.put(null, "TEST");
        rollNameMap.put(0, null);
        rollNameMap.put(1, "A");
        rollNameMap.put(2, "B");


        // 1. size()
        System.out.println("Size: " + rollNameMap.size());


        // 2. isEmpty()
        System.out.println("Is map empty? " + rollNameMap.isEmpty());


        // 3. containsKey(Object key)
        System.out.println("Contains key 1? " + rollNameMap.containsKey(1));

        System.out.println("Contains key 5? " + rollNameMap.containsKey(5));


        // 4. containsValue(Object value)
        System.out.println("Contains value A? " + rollNameMap.containsValue("A"));

        System.out.println("Contains value Z? " + rollNameMap.containsValue("Z"));


        // 5. get(Object key)
        System.out.println("Value for key 1: " + rollNameMap.get(1));

        System.out.println("Value for key 10: " + rollNameMap.get(10));


        // 6. put(K key, V value)
        rollNameMap.put(3, "C");

        System.out.println("After put(3, C): " + rollNameMap);


        // 7. remove(Object key)
        rollNameMap.remove(3);

        System.out.println("After removing key 3: " + rollNameMap);


        // 8. putAll(Map<K,V> m)

        Map<Integer, String> anotherMap = new HashMap<>();

        anotherMap.put(3, "C");
        anotherMap.put(4, "D");

        rollNameMap.putAll(anotherMap);

        System.out.println("After putAll: " + rollNameMap);



        // 10. keySet()
        Set<Integer> keys = rollNameMap.keySet();

        System.out.println("Keys: " + keys);


        // 11. values()
        Collection<String> values = rollNameMap.values();

        System.out.println("Values: " + values);


        // 12. entrySet()
        Set<Map.Entry<Integer, String>> entries = rollNameMap.entrySet();

        System.out.println("Entries:");

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(
                    "Key: " + entry.getKey()
                    + ", Value: " + entry.getValue()
            );
        }


        // 13. putIfAbsent(K key, V value)

        rollNameMap.putIfAbsent(null, "test");
        rollNameMap.putIfAbsent(0, "ZERO");
        rollNameMap.putIfAbsent(5, "E");

        System.out.println("After putIfAbsent: " + rollNameMap);


        // 14. getOrDefault(key, defaultValue)

        System.out.println("Value for key 1: " + rollNameMap.getOrDefault(1, "NOT FOUND"));

        System.out.println("Value for key 100: " + rollNameMap.getOrDefault(100, "NOT FOUND"));


        // 9. clear()
        rollNameMap.clear();

        System.out.println("After clear: " + rollNameMap);

        System.out.println("Is map empty after clear? " + rollNameMap.isEmpty());
    }
}