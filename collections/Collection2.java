//Collection - it is an interface which provides methods to work on grp of objects
//common methods that can be used with different concrete classes like PriorityQueue, ArrayList, LinkedList, Stack, etc

import java.util.*;

public class Collection2{
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(4);
        
        System.out.println("size: " + values.size());
        
        System.out.println("isEmpty: " + values.isEmpty());
        
        System.out.println("contains: " + values.contains(5));
        
        values.add(5);
        
        //here the parameter passed is the index
        values.remove(3);
        System.out.println("removed using index: " + values.contains(5));
        
        values.remove(Integer.valueOf(3));
        System.out.println("removed using Object: " + values.contains(3));
        
        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);
        
        values.addAll(stackValues); //add all stack values to ArrayList
        System.out.println("addAll test using containsAll: " + values.containsAll(stackValues));
        
        values.remove(Integer.valueOf(7));
        System.out.println("containsAll after removing 1 element: " + values.containsAll(stackValues));
        
        values.removeAll(stackValues); //remove all stack values from ArrayList
        System.out.println("removeAll: " + values.contains(8));
        
        values.clear(); //removes all elements
        System.out.println("clear: " + values.isEmpty());
        
        
    }
}