package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

        int number =0;
        while(number<=100)
        {
            System.out.println("The values of number are"+number);
                if(number==24){
                    break;
            }
                         number++;
        }
                            System.out.println("Loop finished");
    }
}

