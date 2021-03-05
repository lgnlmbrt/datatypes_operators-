package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
            for(int i=0; i<=10;i++){
                if(i==6){
                    System.out.println("The value of i is"+i);
                    continue;
                }
                if(i==5)
                    System.out.println("");
                System.out.println("The value of i is"+i);
                if(i==8){
                    System.out.println("i =" + i);
                    continue;
                }
            }
        System.out.println("End loop");
    }
}

