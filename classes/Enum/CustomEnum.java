public class CustomEnum{
    //the brackets are actually constructors for each enum constant 
    MONDAY(1, "First day of the week"),
    TUESDAY(2, "Second day of the week"),
    WEDNESDAY(3, "Third day of the week"),
    THURSDAY(4, "Fourth day of the week"),
    FRIDAY(5, "Fifth day of the week"),
    SATURDAY(6, "Sixth day of the week"),
    SUNDAY(7, "Seventh day of the week");

    //constants need to have these fields to store the values passed in the constructor
    private int val;
    private String description;

    //by default this constructor is private
    CustomEnum(int val, String description) {
        this.val = val;
        this.description = description;
    }

    public int getVal() {
        return val;
    }

    public String getDescription() {
        return description;
    }

    public static CustomEnum getEnumFromValue(int value) { //if val = 1, returns MONDAY
        for (CustomEnum day : CustomEnum.values()) {
            if (day.val == value) {
                return day;
            }
        }
        
        return null; 
    }
}

/*
  public static void main(String[] args){
    CustomEnum customEnum = CustomEnum.getEnumFromValue(1); // Get enum constant by value
    System.out.println(customEnum.getDescription()); // Output: First day of the week 
  }
 */