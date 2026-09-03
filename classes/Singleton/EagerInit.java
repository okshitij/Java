//replace EagerInit w DBConnection
//disadvantage: if the instance is never used, it will still be created and occupy memory since static is preloaded

public class EagerInit{
    private static EagerInit obj = new EagerInit(); //eager initialization

    private EagerInit(){} //private constructor

    public static EagerInit getInstance(){
        return obj;
    }
}