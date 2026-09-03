//normal enum where default values start from 0
public enum NormalEnum {
    MONDAY,     //0
    TUESDAY,    //1
    WEDNESDAY,  //2
    THURSDAY,   //3
    FRIDAY,     //4
    SATURDAY,   //5
    SUNDAY;     //6

    /*
    overriding methods for specific enum constants
    MONDAY{
        @Override
        public void dummyMethod() {
            System.out.println("Monday dummy method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod(){
        System.out.println("dummy method");
    }
     */
}



/*
    public static void main(String[] args){
        //values() to iterate over enum constants
        //ordinal() to get the index of the enum constant (default starting from 0)
        for  (NormalEnum  day : NormalEnum .values()) {
            System.out.println(day.ordinal() + ": " + day.name());
        }

        NormalEnum  variable = NormalEnum .valueOf("FRIDAY"); // Get enum constant by name
        System.out.println(variable.name()); // Output: FRIDAY
    }

*/
