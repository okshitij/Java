//functional interface contains only 1 abstract method, but can contain any number of default and static methods
//using @FunctionalInterface annotation is optional but recommended (gives compile time error if more than 1 abstract method)

@FunctionalInterface
public interface Animal{
    public void eat();
}

//single input parameter, no return value
public interface Consumer{
    public void accept(int a);
}

//no input parameter, single return value
public interface Supplier{
    public int get();
}

//single input parameter, single return value
public interface Function{
    public int apply(int a);
}

//single input parameter, single return value, returns boolean
public interface Predicate{
    public boolean test(int a);
}

public class Interface2 implements Animal{
    public static void main(String[] args){
        //lambda expression
        Interface2 obj = () -> {
            System.out.println("Animal is eating");
        };
        obj.eat();
    }
}