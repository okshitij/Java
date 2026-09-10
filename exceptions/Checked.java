public class Checked {

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        try {
            throw new ClassNotFoundException();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("hello");
        }
    }
}