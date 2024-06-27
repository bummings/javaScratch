// Write a program that collects two integer inputs and assigns them to the variables starting_num and multiplier. Multiply starting_ num by multiplier and output the result. Repeat this process two more times, each time multiplying the previous result by multiplier. The three product outputs should be separated by a whitespace character, ending with a newline.

import java.util.Scanner;

public class scratch {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      System.out.println("Enter starting number: ");
      int starting_num = scnr.nextInt();
      System.out.println("Enter multiplier: ");
      int multiplier = scnr.nextInt();

      int initialResult = (starting_num * multiplier);
      
      for (int i = 0; i < 3; i++) {
          System.out.println(initialResult);
      }
      scnr.close();
   }
}