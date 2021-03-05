package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lowerBound:");
        String lowerBound = scanner.nextLine();
        System.out.println("Enter upperBound:");
        String upperBound = scanner.nextLine();


        int sum = 0;

         int lB = Integer.parseInt(lowerBound);
         int uB = Integer.parseInt(upperBound);
        System.out.println(lB);
        System.out.println(uB);

         for(int number = lB; number <= uB; number++) {
             sum += number;
         }
         double average = sum/(uB - lB);
         System.out.println(sum);
        System.out.println(average);
    }
}
