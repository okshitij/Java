//java is static typed lang meaning we have to declare the type of variable before using it unlike js

public class variables{

    int member_variable; //instance variable -> belongs to the object of the class
    static int static_variable; //static variable -> belongs to the class itself

    public static void main(String[] args){

        byte local_variable = 10; //local variable -> needs to be initialized 

        //primitive data types
        char c = 'a'; // 2 bytes (16 bits) -> 0 to 65535(2^16 - 1)
        byte b = 127; // 1 byte (8 bits) -> -128 to 127 signed
        short s = 32767; // 2 bytes (16 bits) -> -32768 to 32767 signed
        int i = 2147483647; // 4 bytes (32 bits) -> -2147483648 to 2147483647 signed
        long l = 9223372036854775807L; // 8 bytes (64 bits) -> -9223372036854775808 to 9223372036854775807 signed

        float f = 3.14f; // 4 bytes (32 bits) -> 1.4e-45 to 3.4028235e38
        double d = 3.14d; // 8 bytes (64 bits) -> 4.9e-324 to 1.7976931348623157e308

        boolean bool = true; // 1 bit -> true or false

        //-----------------------------------------------------------------------------------------------------
        //types of conversion
        //1. Implicit type conversion (widening/upcasting) - lower to higher data type
        int num = 10;
        double num2 = num; //converting int to double

        //2. Explicit type conversion (narrowing/downcasting) - higher to lower data type
        double num3 = 10.5;
        int num4 = (int) num3; //converting double to int

        //3. promotion during expression
        byte b1 = 127;
        byte b2 = 1;
        int sum = b1 + b2; //byte + byte = int
        //or byte sum = (byte) (b1 + b2); //explicit type conversion
    }
}