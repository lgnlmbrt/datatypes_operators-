package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */
import java.util.Scanner;
public class Exercise_02 {

    public static void main(String[] args) {
        System.out.println("Enter a number from 1-10");
        Scanner newScanner = new Scanner(System.in);
        int userNumber = newScanner.nextInt();


        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
       switch(userNumber){
           case 1:
               System.out.println("1");
               break;
           case 2:
               System.out.println("2");
               break;
           case 3:
               System.out.println("3");
               break;
           case 4:
               System.out.println("4");
               break;
           case 5:
               System.out.println("5");
               break;
           case 6:
               System.out.println("6");
               break;
           case 7:
               System.out.println("7");
               break;
           case 8:
               System.out.println("8");
               break;
           case 9:
               System.out.println("9");
               break;
           case 10:
               System.out.println("10");
               break;

       }
    }
}