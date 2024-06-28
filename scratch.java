import java.util.Scanner;

public class scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // A number is divisible by 3 if the sum of its digits is divisible 
        // by 3. For example, 153 is divisible by 3 because 1 + 5 + 3 = 9 
        // and 9 is divisible by 3.
        // Write a program that collects three integer inputs representing 
        // the place values of a three-digit number. Determines whether the 
        // sum of the digits is divisible by 3. If any integer entered is 
        // a negative value, output Invalid input!
        // Output a formatted message identifying if the three-digit number 
        // is divisible by 3, ending with a newline. Ensure your program 
        // output matches the example formatting below and works for a 
        // variety of input values.

        System.out.println("Please enter three digits: ");
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 < 0 || num2 < 0 || num3 <0) {
            System.out.println("Invalid input!");
            scanner.close();
            return;
        }

        int sum = (num1 + num2 + num3);

        if (sum % 3 == 0) {
            System.out.print(sum + " is divisible by 3!");
        } else {
            System.out.print(sum + " is not divisible by 3!");
        }
        
        


//         /* 4. Write a program that takes a full name, age, and salary 
//         as inputs on separate lines. Output a formatted message 
//         containing the inputs, ending with a newline. Ensure your program 
//         output matches the example formatting below and works for a variety 
//         of input values.
//         If the input is:
//             Pat Ford
//             35
//             60,000
//         the output is:
//             Pat Ford is 35 and makes $60,000.
// */
//         String name = "";
//         int age = 0;
//         int salary = 0;
        
        
//         System.out.print("name: \n");
//         name = scanner.nextLine();
//         System.out.print("age: \n");
//         age = scanner.nextInt();
//         System.out.print("salary: \n");
//         salary = scanner.nextInt();
        

//         System.out.println(name + "is " + age + " and makes " + salary +".");
    

        scanner.close();
    }
}