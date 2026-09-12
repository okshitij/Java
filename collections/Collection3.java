public class Collection3{
    //natural ordering -> ascending -> min pq
    PriorityQueue<Integer> minPQ = new PriorityQueue<>();
    minPQ.add(5);
    minPQ.add(2);
    minPQ.add(8);
    minPQ.add(1);
    
    //print all values -> lvl wise printing
    minPQ.forEach((Integer val) -> System.out.println(val)); // 1 2 8 5
    
    while(!minPQ.isEmpty()){
        int val = minPQ.poll();
        System.out.println("remove from top: " + val); // 1 2 5 8
    }
    
    //max pq
    PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);
    maxPQ.add(5);
    maxPQ.add(2);
    maxPQ.add(8);
    maxPQ.add(1);
    
    //print all values -> lvl wise printing
    maxPQ.forEach((Integer val) -> System.out.println(val)); // 8 2 5 1
    
    while(!maxPQ.isEmpty()){
        int val = maxPQ.poll();
        System.out.println("remove from top: " + val); // 8 5 2 1
    }
}