public class StaticNested{
    int x = 10; //instance variable
    static int y = 20; //static variable

    static class Nested{
        public void display(){
            System.out.println("y = " + y); //can access static variable of outer class
            //System.out.println("x = " + x); //cannot access instance variable of outer class
        }
    }

    //static nested class can be private, public, protected or default
    private static class PrivateNested{
        public void display(){
            System.out.println("y = " + y); //can access static variable of outer class
            //System.out.println("x = " + x); //cannot access instance variable of outer class
        }
    }

    public void display1(){
        PrivateNested privateNested = new PrivateNested(); //need to create an instance of private nested class to access its methods
        privateNested.display();
    }
}