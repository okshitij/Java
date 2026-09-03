/* replace DoubleCheck w DBConnection

    here it first checks if instance is null, if yes then it will put a lock and check again if the instance is null, 
    if yes then it will create the instance and return it, otherwise it will return the existing instance.

    disadvantage: memory issue -> when other thread is trying to access the instance, the synch in memory is not visible to other threads, so it will create another instance.
    to get rid of this issue, we used volatile keyword

    and this is also slow
 */

public class DoubleCheck{
    public static volatile DoubleCheck obj; //volatile keyword is used to make sure that multiple threads handle the obj variable correctly when it is being initialized to the Singleton instance

    private DoubleCheck(){} //private constructor

    public static DoubleCheck getInstance(){
        if(obj == null){ //check 1
            synchronized(DoubleCheck.class){ //lock
                if(obj == null){ //check 2
                    obj = new DoubleCheck();
                }
            }
        }
        return obj;
    }
}