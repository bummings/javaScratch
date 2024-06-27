import java.util.Scanner;

public class scratch {
    public static void main(String[] args) {
        /* Write a program that takes a full name, age, and salary as inputs on separate lines. Output a formatted message containing the inputs, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
        If the input is:
            Pat Ford
            35
            60,000
        the output is:
            Pat Ford is 35 and makes $60,000.
*/
        String name = "";
        int age = 0;
        double salary = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("name: ");
        name = scanner.nextLine();
        System.out.print("age: ");
        age = scanner.nextInt();
        System.out.print("salary: ");
        salary = scanner.nextDouble();
        

        System.out.println("OK bro " + name);
        
        scanner.close();
    }
}