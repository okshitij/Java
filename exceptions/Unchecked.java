//occurs during runtime and compiler not forcing us to handle them

public class Unchecked{
    public static void main(String[] args) {
        //class cast exception
        Object obj = new Integer(10);
        System.out.println((String)obj); //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

        //arithmetic exception
        int val = 10/0; //java.lang.ArithmeticException: / by zero

        //array index out of bound
        int[] arr = new int[5];
        System.out.println(arr[6]); 

        //string index out of bound
        String val1 = "hello";
        System.out.println(val1.charAt(5));

        //null pointer exception
        String str = null;
        System.out.println(str.charAt(0))

        //illegal arg exception
        int x = Integer.parseInt("abc"); // number format exception; would've been fine if string was a number like "69"
    }
}