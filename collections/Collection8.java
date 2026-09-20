public class Collection8{
    public static void main(String[] args){
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(4100);
        salaryList.add(9000);
        salaryList.add(1000);
        salaryList.add(3500);

        long output = salaryList.stream().filter((Integer sal) -> sal > 3000).count();
        System.out.println("Total Employee w salary > 3000" + output);

        //different ways to create stream
        //from collectiom
        List<Integer> salaryList1 = Arrays.asList(3000, 4000, 9000, 1000, 3500);
        Stream<Integer> stream1 = salaryList.stream();

        //from arrays
        Integer[] salaryArray = {3000, 4000, 9000, 1000, 3500};
        Stream<Integer> stream2 = Arrays.stream(salaryArray);

        //from static method
        Stream<Integer> stream3 = Stream.of(3000, 4000, 9000, 1000, 3500);

        //from stream builder
        Stream.Builder<Integer> streamBuilder = Stream.Builder();
        streamBuilder.add(1000).add(3500).add(9000);
        Stream<Integer> stream4 = streamBuilder.build();

        //from stream iterate
        Stream<Integer> stream5 = Stream.iterate(1000, (Integer n ) -> n + 5000).limit(5); // 1000 6000 11000 16000 21000


        //different intermediate operations
        //filter(Predicate<T> predicate)
        Stream<String> nameStream = Stream.of("Hello", "everyone", "how", "are", "you", "doing");
        Stream<String> filteredStream = nameStream.filter((String name) -> name.length() <= 3);
        filteredStream.forEach((String name) -> System.out.println(name)); //how are you
        

    }
}