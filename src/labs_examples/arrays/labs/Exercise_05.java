package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4 };
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (count++ % 2 != 0) {
                continue;
            }
            System.out.println(array[i]);
        }

    }

}
