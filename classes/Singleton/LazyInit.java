/*replace LazyInit w DBConnection

here it will first check if the instance is null, if yes then it will create the instance and return it, otherwise it will return the existing instance. 
This way the instance will be created only when it is required and not before that. This is called lazy initialization.

disadvantage: if multiple threads access the getInstance() method simultaneously, it can lead to multiple instances being created. 
To avoid this, we can make the getInstance() method synchronized, but that will reduce performance.
*/  


public class LazyInit{
    private static LazyInit obj; //lazy initialization

    private LazyInit(){} //private constructor

    public static LazyInit getInstance(){
        if(obj == null){
            obj = new LazyInit();
        }
        return obj;
    }
}