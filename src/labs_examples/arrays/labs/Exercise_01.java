package labs_examples.arrays.labs;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */
public class Exercise_01 {
    public static void main(String[] args) {


        int[] firstArray = new int[10];

        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;
        firstArray[5] = 6;
        firstArray[6] = 7;
        firstArray[7] = 8;
        firstArray[8] = 9;
        firstArray[9] = 10;


        int sum = 0;
        int avrg = 0;
        int lengthOfArray = firstArray.length;

        for(int i =0; i<lengthOfArray; i++) {
            sum = sum + firstArray[i];
            avrg = sum/10;

        }
        System.out.println(sum);
        System.out.println(avrg);

    }
}







