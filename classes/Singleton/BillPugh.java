/* replace BillPugh w DBConnection

    here it will create the instance of BillPugh class when the SingletonHelper class is loaded into memory.
    this is thread safe and also it is lazy initialization because the instance will be created only when the getInstance() method is called for the first time.
 */

public class BillPugh{
    private BillPugh(){} //private constructor

    private static class SingletonHelper{
        private static final BillPugh obj = new BillPugh(); //BillPugh instance will be created when the SingletonHelper class is loaded into memory
    }

    public static BillPugh getInstance(){
        return SingletonHelper.obj;
    }
}