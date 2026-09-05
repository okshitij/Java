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