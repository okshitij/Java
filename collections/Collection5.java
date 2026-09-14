import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collection5 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(0, 100);
        list1.add(1, 200);
        list1.add(2, 300);

        List<Integer> list2 = new ArrayList<>();

        list2.add(0, 400);
        list2.add(1, 500);
        list2.add(2, 600);

        // addAll(index, collection)
        list1.addAll(2, list2);

        System.out.println("After addAll:");
        list1.forEach((Integer val) -> System.out.println(val));
        // 100 200 400 500 600 300


        // replaceAll()
        list1.replaceAll((Integer val) -> -1 * val);

        System.out.println("\nAfter replaceAll:");
        list1.forEach((Integer val) -> System.out.println(val));
        // -100 -200 -400 -500 -600 -300


        // sort()
        list1.sort((Integer val1, Integer val2) -> val1 - val2);

        System.out.println("\nAfter sorting:");
        list1.forEach((Integer val) -> System.out.println(val));
        // -600 -500 -400 -300 -200 -100


        // get(index)
        System.out.println("\nValue present at index 2: " + list1.get(2));


        // set(index, value)
        list1.set(2, -4000);

        System.out.println("\nAfter set method:");
        list1.forEach((Integer val) -> System.out.println(val));


        // remove(index)
        list1.remove(2);

        System.out.println("\nAfter removing:");
        list1.forEach((Integer val) -> System.out.println(val));


        // indexOf()
        System.out.println(
            "\nIndex of -200 integer object is: " + list1.indexOf(-200)
        );


        // --------------------------------------------------
        // ListIterator - traversing backward
        // --------------------------------------------------

        // Specifies where to start the iterator from
        ListIterator<Integer> listIterator1 =
                list1.listIterator(list1.size());

        System.out.println("\nTraversing backward:");

        while (listIterator1.hasPrevious()) {

            int previousVal = listIterator1.previous();

            System.out.println(
                "traversing backward: " + previousVal
                + " + nextIndex: " + listIterator1.nextIndex()
                + " + previousIndex: " + listIterator1.previousIndex()
            );

            // Change -100 to -50
            if (previousVal == -100) {
                listIterator1.set(-50);
            }
        }


        System.out.println("\nAfter set:");

        list1.forEach(
            (Integer val) -> System.out.println("after set: " + val)
        );


        // --------------------------------------------------
        // ListIterator - traversing forward
        // --------------------------------------------------

        ListIterator<Integer> listIterator2 = list1.listIterator();

        System.out.println("\nTraversing forward:");

        while (listIterator2.hasNext()) {

            int val = listIterator2.next();

            System.out.println(
                "traversing forward: " + val
                + " + nextIndex: " + listIterator2.nextIndex()
                + " + previousIndex: " + listIterator2.previousIndex()
            );

            // When we find -200, add -100
            if (val == -200) {
                listIterator2.add(-100);
            }
        }


        System.out.println("\nAfter add:");

        list1.forEach(
            (Integer val) -> System.out.println("after add: " + val)
        );


        // --------------------------------------------------
        // subList()
        // --------------------------------------------------

        List<Integer> subList = list1.subList(1, 4);

        System.out.println("\nSublist:");

        subList.forEach(
            (Integer val) -> System.out.println("sublist: " + val)
        );
    }
}