import java.util.Scanner;

class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in); //system.in -> read from the keyboard
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        String city = sc.next(); //reads only one word
        System.out.println("Your city is: " + city);

        sc.nextLine(); //consume the leftover newline character because next leaves a newline character in the input buffer
        //or just use nextLine() everywhere

        String full_name = sc.nextLine();
        System.out.println("Your full name is: " + full_name);
        
    }
}