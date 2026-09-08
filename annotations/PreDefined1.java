//predefined annotations used on java code

public class PreDefined1 {

    @SafeVarargs
    public static void printLogValues(List<Integer> logValues) {
       Object[] objectList = logValues;
    
       //heap pollution -> obj of type List<String> is assigned to obj of type List<Integer>
       //to suppress this warning, we can use @SafeVarargs annotation on the method
       //method should be final or static only -> what if you override and forget to use @SafeVarargs annotation on the overridden method
       List<String> stringList = new ArrayList<>();
       stringList.add("Hello");
       objectList[0] = stringList;
    }

    public static void main(String[] args) {

        // @Deprecated annotation is used to indicate that a method or class is deprecated and should not be used
        //need to provide alternative method or class to use instead
        @Deprecated
        public void oldMethod() {
            System.out.println("This method is deprecated");
        }

        //@SuppressWarnings("deprecation") //suppress warning for using deprecated method
        oldMethod();


    }
}