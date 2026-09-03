public class AbstractEnum {
    //since dummy method is abstract, each enum constant must implement it
    MONDAY{
        public void dummyMethod() {
            System.out.println("Monday dummy method");
        }
    },
    TUESDAY{
        public void dummyMethod() {
            System.out.println("Tuesday dummy method");
        }
    },
    SUNDAY{
        public void dummyMethod() {
            System.out.println("Sunday dummy method");
        }
    };

    public abstract void dummyMethod(); //abstract method that must be implemented by each enum constant
}

/*
  public static void main(String[] args){
    AbstractEnum day = AbstractEnum.MONDAY;
    day.dummyMethod(); // Output: Monday dummy method
  }
 */