import java.util.*;


public class scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
    
            // 8. Write a program that creates an array to hold three values of type double. The program 
            // should collect the three double values as input and store them in the array. Then calculate 
            // the average value of the array.
            // Output the array values and calculated average value, ending with a newline. Ensure your 
            // program output matches the example formatting below and works for a variety of input values.
            // If the input is:
            // 10.0
            // 10.5
            // 11.0
            // the output is:
            // Array items: 10.0, 10.5, 11.0
            // Average: 10.5

            // ArrayList<Double> numbers = new ArrayList<>(3);

            // System.out.println("Please input three integers: ");

            // while (numbers.size() < 3 ) {
            //     double input = scanner.nextDouble();
            //     numbers.add(input);
            // } 
            // double sum = 0;
            // for (double number : numbers) {
            //     sum += number;
            // }
            
            // double average = sum / numbers.size();

            // // convert array to a string to remove brackets
            // String output = numbers.stream()
            //                         .map(String::valueOf)
            //                         .collect(Collectors.joining(", "));


            
            // System.out.println("Array items: " + output);
            // System.out.println("Average: " + average);
    



            // 7. Write a program that collects any number of non-negative integer inputs and 
            // calculates the sum of the values. A negative integer should end the input collection and 
            // is not part of the sum.
            // Output the smallest non-negative value and the sum of the non-negative input values, ending 
            // with a newline. Ensure your program output matches the example formatting below and works for 
            // a variety of input values.
            // If the input is:
            // 15
            // 20
            // 0
            // 3
            // -1
            // the output is:
            // Smallest: 0
            // Sum: 38

            // ArrayList<Integer> numbers = new ArrayList<>();
            // System.out.println("Please enter a number: ");
            // while (true) {
            //     int input = scanner.nextInt();
                

            //     if (input >= 0) {
            //         numbers.add(input);
            //     }
            //     if (input == -1) {
            //         int smallest = Collections.min(numbers);
            //         System.out.println("Smallest: " + smallest);
                    
            //         int sum = 0;
            //         for (int number : numbers) {
            //             sum += number;
            //         };

            //         System.out.println("Sum: " + sum);
            //         // System.out.println("Sum: ");
            //         break;
            //     }
            //     System.out.println(numbers);
            // }


            // 6. Write a program that collects a full name as one string input.
            // Format and output the name as shown: 
            // lastInitial., firstName middleInitial.
            //
            // If there is no middle name, format as: lastInitial., firstName
            // Ex: input is Edd Allen Bummings, output is B. Edd A,

            
            // System.out.println("Please enter your full name. ");
            // String fullName = scanner.nextLine();
            
            // String[] nameParts = fullName.split(" ");

            // if (nameParts.length == 3) {
            //     System.out.println("First name: " + nameParts[0]);
            //     System.out.println("Last name is: " + nameParts[2]);
            //     System.out.println("Middle name is: " + nameParts[1]);
            //     String formattedName = nameParts[2] + ", " + nameParts[0].charAt(0) + ". " + nameParts[1].charAt(0) + ".";
            //     System.out.println(formattedName);
            // } else if (nameParts.length == 2) {
            //     System.out.println("First name: " + nameParts[0]);
            //     System.out.println("Last name is: " + nameParts[1]);
            //     String formattedName = nameParts[1] + ", " + nameParts[0].charAt(0) + ".";
            //     System.out.println(formattedName);
            // } 




        
            // // 5. A number is divisible by 3 if the sum of its digits is divisible 
            // // by 3. For example, 153 is divisible by 3 because 1 + 5 + 3 = 9 
            // // and 9 is divisible by 3.
            // // Write a program that collects three integer inputs representing 
            // // the place values of a three-digit number. Determines whether the 
            // // sum of the digits is divisible by 3. If any integer entered is 
            // // a negative value, output Invalid input!
            // // Output a formatted message identifying if the three-digit number 
            // // is divisible by 3, ending with a newline. Ensure your program 
            // // output matches the example formatting below and works for a 
            // // variety of input values.

            // System.out.println("Please enter three digits: ");
            
            // int num1 = scanner.nextInt();
            // int num2 = scanner.nextInt();
            // int num3 = scanner.nextInt();

            // if (num1 < 0 || num2 < 0 || num3 <0) {
            //     System.out.println("Invalid input!");
            //     scanner.close();
            //     return;
            // }

            // int sum = (num1 + num2 + num3);

            // if (sum % 3 == 0) {
            //     System.out.print(sum + " is divisible by 3!");
            // } else {
            //     System.out.print(sum + " is not divisible by 3!");
            // }
        
        


            //  4. Write a program that takes a full name, age, and salary 
            //  as inputs on separate lines. Output a formatted message 
            //  containing the inputs, ending with a newline. Ensure your program 
            //  output matches the example formatting below and works for a variety 
            //  of input values.
            //  If the input is:
            //      Pat Ford
            //      35
            //      60,000
            //  the output is:
            //      Pat Ford is 35 and makes $60,000.
            //
            //  String name = "";
            //  int age = 0;
            //  int salary = 0;
            
            
            //  System.out.print("name: \n");
            //  name = scanner.nextLine();
            //  System.out.print("age: \n");
            //  age = scanner.nextInt();
            //  System.out.print("salary: \n");
            //  salary = scanner.nextInt();
            

            //  System.out.println(name + "is " + age + " and makes " + salary +".");
    

        scanner.close();
    }
}