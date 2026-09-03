/* replace SynchronizedBlock w DBConnection

    this is used to avoid the problem of lazy init
    solved using synchronized keyword -> puts lock and unlock
    slow cuz of locking and unlocking
 */ 

public class SynchronizedBlock{
    private static SynchronizedBlock obj;

    private SynchronizedBlock(){} //private constructor

    synchronized public static SynchronizedBlock getInstance(){
        if(obj == null){
                if(obj == null){
                    obj = new SynchronizedBlock();
                }
        }
        return obj;
    }
}