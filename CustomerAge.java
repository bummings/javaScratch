// An existing class Customer() has been provided in Customer.java. Write a program in main() of CustomerAge.java to accept one string input and one integer input for a customer's name and age fields, respectively. Use the existing customer 1 and customer 2 reference variables provided in the template to set the name and age of both customer objects using the setName( ) and setAge() methods. Determine which customer is older using its getAge () method
// Output the older customer's information using its printInfo() method, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
// If the input is:
// Jane
// 25
// John
// 29
// the output is:
// Customer that is older:
// Name: John
// Age: 29

import java.util.*;

public class CustomerAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create customer objects
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        // Input and set the name and age for customer1
        customer1.setName(scanner.nextLine());
        customer1.setAge(scanner.nextInt());
        scanner.nextLine(); // Consume newline left-over

        // Input and set the name and age for customer2
        customer2.setName(scanner.nextLine());
        customer2.setAge(scanner.nextInt());

        // Determine which customer is older and print their info
        if (customer1.getAge() > customer2.getAge()) {
            customer1.printInfo();
        } else {
            customer2.printInfo();
        }

        scanner.close();
    }
}