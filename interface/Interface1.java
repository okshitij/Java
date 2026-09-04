public interface Bird{
    public static final int wings = 2; //constant
    public void fly();

    public interface Nested{
        public void buildNest();
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