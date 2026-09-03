//lets say we have an interface
public interface DummyInterface{
    public String toLowerCase();
}

public class InterfaceEnum implements DummyInterface{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
    //you can still override this method for specific enum constants if needed

}

/*
    public static void main(String[] args){
        InterfaceEnum day = InterfaceEnum.MONDAY;
        System.out.println(day.toLowerCase()); // Output: monday
    }
 */