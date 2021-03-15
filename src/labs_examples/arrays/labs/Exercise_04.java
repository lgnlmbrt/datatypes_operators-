package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] twoDArray = new int[2][2];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int x = 0; x < twoDArray.length; x++) {
                twoDArray[i][x] = i * x;
                System.out.println(twoDArray[i][x] + " " + " | ");
            }
            System.out.println();
        }
    }
}