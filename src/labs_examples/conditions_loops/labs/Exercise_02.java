package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */
import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner daysOfWeek = new Scanner(System.in);
        System.out.println("Enter Number:");
        String weekDay = daysOfWeek.nextLine();
        System.out.println("The day of the week is " + weekDay);

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

        int number =1;


        if(number ==1) {
            System.out.println("Monday");
        }else
            if(number==2){
            System.out.println("Tuesday");
        }else
            if(number==3){
            System.out.println("Wednesday");
        }else
            if(number==4){
            System.out.println("Thursday");
        }else
            if(number==5){
            System.out.println("Friday");
        }else
            if(number==6){
            System.out.println("Saturday");
        }else
            if(number==7){
            System.out.println("Sunday");

        }

    }
}
