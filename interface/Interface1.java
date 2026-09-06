public interface Bird{
    public static final int wings = 2; //constant
    public void fly();

    public interface Nested{
        public void buildNest();
    }

    // Default method -> you don't have to implement it in the implementing class (java 8 feature)
    // cuz what if its implemented in lots of classes and you want to change the implementation of that method, 
    // you can just change it in the interface and all the implementing classes will get the new implementation
    default void chirp(){
        System.out.println("Chirp chirp");

        sleep(); // calling static method
        privateMethod(); // calling private method
        privateStaticMethod(); // calling private static method
    }

    //same as default method but can't be overridden in the implementing class
    static void sleep(){
        System.out.println("Bird is sleeping");

        privateStaticMethod(); // calling private static method
    }

    //java 9 feature
    private void privateMethod(){
        System.out.println("This is a private method in the interface");
    }

    private static void privateStaticMethod(){
        System.out.println("This is a private static method in the interface");
    }
}

public class Interface1 implements Bird{
    public void fly(){
        System.out.println("Bird is flying");
    }

    public static void main(String[] args){
        Interface1 obj = new Interface1();
        obj.fly();

        Bird.Nested nestedObj = new Bird.Nested(){
            public void buildNest(){
                System.out.println("Building nest");
            }
        };
        nestedObj.buildNest();
    }
}