public class Reflection1{
    public static void main(String[] args){
        Class eagleClass = Eagle.class; //.class to access the class object of Eagle class
        
        System.out.println("Class Name: " + eagleClass.getName()); // Eagle
        System.out.println(Modifier.toString(eagleClass.getModifiers())); // public


        
        Method[] methods = eagleClass.getMethods(); //get all public methods of Eagle class
        Method[] declaredMethods = eagleClass.getDeclaredMethods(); //get all methods of Eagle class, including private methods
        
        //this will also print methods of Object class as well, because Eagle class is subclass of Object class
        for(Method method : methods){
            System.out.println("Method Name: " + method.getName()); //fly
            System.out.println("Return Type: " + method.getReturnType()); //void
            System.out.println("Class name: " + method.getDeclaringClass()); // Eagle
        }


        
        Field[] fields = eagleClass.getDeclaredFields(); //get all fields of Eagle class, including private fields

        Field field1 = eagleClass.getDeclaredField("breed"); //get field by name
        field1.set(eagleObject, "Bald Eagle"); //set value of field

        Field field2 = eagleClass.getDeclaredField("canSwim");
        field2.setAccessible(true); //make private field accessible, breaks encapsulation
        field2.set(eagleObject, true); //set value of private field



        Constructor[] constructors = eagleClass.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()));

            eagleConstructor.setAccessible(true); //breaks singleton class by making private constructor accessible
            Eagle eagleObject = (Eagle) eagleConstructor.newInstance();
            eagleObject.fly();
        }
    }
}